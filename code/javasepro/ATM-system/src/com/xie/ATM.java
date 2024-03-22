package com.xie;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ATM {
    Scanner sc = new Scanner(System.in);
    private ArrayList<Account> accounts = new ArrayList<>();
    private Account loginAcc; // 記住登入後的用戶

    public void starts(){

        while (true) {
            System.out.println("===歡迎進入系統===");
            System.out.println("1. 用戶登入");
            System.out.println("2. 我是新用戶");
            System.out.println("3. 退出");
            System.out.println("請選擇:");
            String command = sc.next();

            switch (command){
                case "1":
                    // 用戶登入
                    login();
                    break;
                case "2":
                    // 建立新帳戶
                    createAccount();
                    break;
                case "3":
                    System.out.println("已退出系統");
                    return;
                default:
                    System.out.println("輸入錯誤");
            }
        }

    }

    // 完成開戶操作
    private void createAccount(){
        System.out.println("===開戶系統===");
        // 1. 建立一個帳戶對象，封裝用戶的開戶訊息
        Account acc = new Account();

        // 2. 用戶輸入自己的訊息，賦值給帳戶對象
        System.out.println("請輸入用戶名稱:");
        String name = sc.next(); // 用戶名稱輸入
        acc.setUserName(name);

        while (true){
            System.out.println("請輸入性別(男/女)");
            char sex = sc.next().charAt(0);
            if(sex == '男' || sex == '女'){
                acc.setSex(sex);
                break;
            }else {
                System.out.println("輸入有誤!");
            }
        }

        while (true){
            System.out.println("請輸入密碼:");
            String passWord = sc.next();
            System.out.println("再次輸入密碼:");
            String okPassWord = sc.next();
            if(passWord.equals(okPassWord)){
                acc.setPassWord(passWord);
                break;
            }else {
                System.out.println("兩次密碼不相符，請確認後再次輸入");
            }
        }

        System.out.println("每次提款額度:");
        double limit = sc.nextDouble();
        acc.setLimit(limit);

        // 由系統生成一個8位數字卡號，並且不能和已有帳戶重複
        String newCardId = createCardId();
        acc.setCardID(newCardId);

        // 3. 將帳戶對象，存入帳戶集合中
        accounts.add(acc);
        System.out.println("恭喜" + acc.getUserName() + "開戶成功, 卡號是:" + acc.getCardID());
    }

    // 生成卡號方法，返回一個8位數字卡號
    private String createCardId(){
        Random r = new Random();
        while (true) {
            // 1. 定義一個String紀錄生成的卡號
            String cardId = "";
            // 2. 使用循環，8次，每次產生一個隨機數字給cardId紀錄

            for (int i = 0; i < 8;i++){
                int data = r.nextInt(10); // 0-9
                cardId += data;
            }

            // 3. 判斷該卡號是否與其他卡號重覆了，沒有重複才能作為新卡號返回
            Account acc = getAccountByCardId(cardId);
            if (acc == null) {
                // 說明卡號沒有重複，可用來作為新卡號
                return cardId;
            }
        }
    }

    // 根據卡號查詢帳戶對象返回
    private Account getAccountByCardId(String cardId){
        // 遍歷所有帳戶
        for (int i = 0; i < accounts.size(); i++) {
            Account acc = accounts.get(i);
            if(acc.getCardID().equals(cardId)){
                return acc;
            }
        }
        return null; // 查無此帳戶
    }

    // 用戶登入操作
    private void login(){
        System.out.println("===已進入登入系統===");
        if(accounts.size() == 0){
            System.out.println("當前系統內沒有用戶，請先開戶");
            return; // 跳出登入操作
        }

        while (true) {
            System.out.println("輸入您的卡號:");
            String cardId = sc.next();
            Account acc = getAccountByCardId(cardId);
            if (acc == null){
                // 卡號不存在
                System.out.println("您輸入的卡號不存在，請再次確認");
            }else {
                while (true) {
                    // 卡號存在
                    System.out.println("請輸入密碼:");
                    String passWord = sc.next();
                    if (acc.getPassWord().equals(passWord)){
                        loginAcc = acc;
                        // 登入成功
                        System.out.println("恭喜" + acc.getUserName() + "成功登入，您的卡號是:" + acc.getCardID());
                        showUserCommand();
                        return; // 跳出並結束當前方法
                    }else {
                        System.out.println("密碼錯誤，請確認");
                    }
                }
            }
        }
    }

    // 登入後的操作介面
    private void showUserCommand(){
        while (true) {
            System.out.println(loginAcc.getUserName()+"您可以選擇下列功能進行操作");
            System.out.println("1. 查詢帳戶");
            System.out.println("2. 存款");
            System.out.println("3. 取款");
            System.out.println("4. 轉帳");
            System.out.println("5. 密碼修改");
            System.out.println("6. 退出");
            System.out.println("7. 註銷當前帳戶");
            String command = sc.next();
            switch (command){
                case "1":
                    // 查詢帳戶
                    showLoginAccount();
                    break;
                case "2":
                    // 存款
                    depositMoney();
                    break;
                case "3":
                    // 取款
                    drawMoney();
                    break;
                case "4":
                    // 轉帳
                    transferMoney();
                    break;
                case "5":
                    // 密碼修改
                    updatePassWord();
                    return;
                case "6":
                    // 退出
                    System.out.println(loginAcc.getUserName() + "登出系統成功!");
                    return; // 退出並結束當前方法
                case "7":
                    // 註銷帳戶
                    if(deleteAccount()){
                        // 銷戶成功, 回到歡迎介面
                        return;
                    }
                    break;
                default:
                    System.out.println("當前操作不存在，請確認");
            }
        }

    }



    // 取得登入後帳戶訊息
    private void showLoginAccount(){
        System.out.println("========當前帳戶訊息========");
        System.out.println("卡號:" + loginAcc.getCardID());
        System.out.println("用戶名:" + loginAcc.getUserName());
        System.out.println("性別:" + loginAcc.getSex());
        System.out.println("餘額:" + loginAcc.getMoney());
        System.out.println("每次提款額度:" + loginAcc.getLimit());
    }

    // 存錢
    private void depositMoney() {
        System.out.println("===存錢操作===");
        System.out.println("請您輸入存款金額");
        double money = sc.nextDouble();

        // 更新當前登入的帳戶餘額
        loginAcc.setMoney(loginAcc.getMoney() + money);
        System.out.println("存錢成功");
        System.out.println("餘額" + loginAcc.getMoney());
    }

    // 領錢
    private void drawMoney() {
        System.out.println("===提款操作===");
        // 1. 判斷餘額是否超過100
        if (loginAcc.getMoney() < 100){
            System.out.println("金額不足100元，無法領取");
            return;
        }

        // 2. 輸入提款金額
        OUT:
        while (true) {
            System.out.println("請輸入您的操作 1.領錢 2.退出");
            String command = sc.next();
            switch(command) {
                case "1":
                    System.out.println("請輸入提款金額");
                    double money = sc.nextDouble();

                    // 3. 判斷餘額是否足夠
                    if (loginAcc.getMoney() >= money) {
                        // 餘額足夠
                        if (money > loginAcc.getLimit()) {
                            System.out.println("提款金額超過每次提款限額，您的限額為:" + loginAcc.getLimit());
                            break;
                        } else {
                            loginAcc.setMoney(loginAcc.getMoney() - money);
                            System.out.println("取款:" + money + "成功，當前用戶餘額:" + loginAcc.getMoney());
                            break; // 結束while循環
                        }
                    } else {
                        System.out.println("餘額不足，當前用戶餘額為:" + loginAcc.getMoney());
                        break;
                    }
                case "2":
                    break OUT;
                default:
                    System.out.println("無此操作");
            }
        }

    }

    // 轉帳
    private void transferMoney(){
        System.out.println("===帳戶轉帳===");
        // 1. 判斷系統是否存在其他帳戶
        if (accounts.size() < 2 ){
            System.out.println("當前帳戶只有一名，無其他轉帳對象");
            return;
        }

        // 2. 判斷自己帳戶是否有錢
        if (loginAcc.getMoney() == 0){
            System.out.println("帳戶內沒有可轉帳的錢");
            return;
        }

        while (true) {
            // 3. 開始轉帳
            System.out.println("輸入對方的卡號:");
            String cardId = sc.next();

            // 4. 判斷卡號是否正確
            Account acc = getAccountByCardId(cardId);
            if (acc == null) {
                System.out.println("輸入的卡號不存在");
            } else {
                // 對方的卡號存在，繼續讓用戶輸入認證
                String name = "*" + acc.getUserName().substring(1);
                System.out.println("請輸入【" + name + "】的姓氏");
                String preName = sc.next();
                // 5. 判斷姓氏是否正確
                if (acc.getUserName().startsWith(preName)) {
                    // 認證通過
                    System.out.println("輸入要轉帳的金額:");
                    double money = sc.nextDouble();
                    // 6. 判斷金額有無超過餘額
                    if (loginAcc.getMoney() >= money){
                        // 轉給對方
                        // 更新自己的帳戶餘額
                        loginAcc.setMoney(loginAcc.getMoney() - money);
                        // 更新對方的帳戶餘額
                        acc.setMoney(acc.getMoney() + money);
                        System.out.println("轉帳成功");
                        return; // 直接跳出轉帳方法
                    }else {
                        System.out.println("餘額不足，帳戶餘額:" + loginAcc.getMoney());
                    }
                } else {
                    System.out.println("認證有誤");
                }
            }
        }
    }

    // 帳戶密碼修改
    private void updatePassWord() {
        System.out.println("===修改密碼===");
        // 1. 提醒用戶認證當前密碼
        while (true) {
        System.out.println("請輸入現在的密碼:");
        String passWord = sc.next();
        // 2. 認證密碼是否正確

            if (loginAcc.getPassWord().equals(passWord)) {
                // 認證通過
                // 3. 開始修改密碼
                while (true) {
                    System.out.println("輸入新密碼:");
                    String newPassWord = sc.next();

                    System.out.println("再次輸入密碼:");
                    String okPassWord = sc.next();

                    if (!okPassWord.equals(newPassWord)) {
                        System.out.println("兩次密碼不一致");
                    } else if (newPassWord.equals(passWord)) {
                        System.out.println("新舊密碼不可相同，請確認");
                    } else{
                        // 真正開始修改密碼
                        loginAcc.setPassWord(newPassWord);
                        System.out.println("密碼修改成功");
                        return;
                    }
                }
            }else {
                System.out.println("當前密碼輸入錯誤");
            }
        }
    }

    // 註銷帳戶
    private boolean deleteAccount(){
        System.out.println("===進行註銷操作===");
        // 1. 詢問是否要進行銷戶
        System.out.println("操作一旦完成將無法回復，您確定要註銷帳戶嗎?y/n");
        while (true) {
            String command = sc.next();
            switch (command){
                case "y":
                    // 確定銷戶
                    // 2. 判斷用戶帳戶是否有餘額
                    if (loginAcc.getMoney() == 0){
                        // 可以進行
                        accounts.remove(loginAcc);
                        System.out.println("您的帳戶已成功註銷");
                        return true;
                    }else {
                        System.out.println("帳戶內尚有餘額，無法進行註銷作業");
                        return false;
                    }
                case "n":
                    System.out.println("已取消註銷操作");
                    return false;
                default:
                    System.out.println("輸入錯誤，請再次輸入:y/n");
                    break;
            }
        }
    }

}
