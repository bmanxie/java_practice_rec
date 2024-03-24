package com.xie.d3_collection_test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Pattern;

public class Room {
    // 必須有一副牌
    private List<Card> allCards = new ArrayList<>();

    public Room(){
        // 1.做出54張牌, 存入allCards
        // a.點數: 個數確定，類型確定
        String[] numbers = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        // b.花色: 個數確定，類型確定
        String[] colors = {"♠","♥","♦","♣"};
        int size = 0; // 表示每張牌的大小
        // c.遍歷點數，再遍歷花色，組織牌
        for(String number: numbers){
            // number = "3"
            size++; // 1
            for (String color: colors){
                // 得到一張牌
                Card c = new Card(number, color, size);
                allCards.add(c); // 存入了牌
            }
        }
        // 單獨存入大小王
        Card c1 = new Card("", "小王", ++size);
        Card c2 = new Card("", "大王", ++size);
        Collections.addAll( allCards, c1, c2);
        System.out.println("新牌: " + allCards);
    }

    /**
     * 遊戲啟動
     */
    public void star() {
        // 1. 洗牌: allCards
        Collections.shuffle(allCards);
        System.out.println("洗牌後: " + allCards);

        // 2. 發牌，首先定義 三個玩家。 List(ArrayList)
        List<Card> player1 = new ArrayList<>();
        List<Card> player2 = new ArrayList<>();
        List<Card> player3 = new ArrayList<>();
        // 正式發牌給三位玩家，依次發出51張牌，剩餘三張做為底牌
        for (int i = 0; i < allCards.size() - 3; i++) {
            Card c = allCards.get(i);
            // 判斷發給誰
            if(i % 3 == 0){
                // player1 拿牌
                player1.add(c);
            } else if (i % 3 == 1) {
                // player2 拿牌
                player2.add(c);
            } else {
                // player3 拿牌
                player3.add(c);
            }
        }

        // 3. 對三個玩家的牌進行排序
        sortCards(player1);
        sortCards(player2);
        sortCards(player3);
        // 4. 看牌
        System.out.println("玩家1 " + player1);
        System.out.println("玩家2 " + player2);
        System.out.println("玩家3 " + player3);
        List<Card> lastThreeCards = allCards.subList(allCards.size() - 3, allCards.size()); // 51, 52, 53
        System.out.println("底牌: " + lastThreeCards);
        player1.addAll(lastThreeCards);
        sortCards(player1);
        System.out.println("player1搶到地主後: " + player1);
    }

    /**
     * 集中進行排序
     * @param cards
     */
    private void sortCards(List<Card> cards){
        Collections.sort(cards, new Comparator<Card>() {
            @Override
            public int compare(Card o1, Card o2) {
                 return o1.getSize() - o2.getSize();
            }
        });
    }
}
