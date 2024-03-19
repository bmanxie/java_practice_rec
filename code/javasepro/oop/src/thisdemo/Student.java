package thisdemo;

public class Student {
    double score;

    public void pintThis(){
        System.out.println(this);
    }

    public void printPass(double score){
        // 利用this變量，得到當前物件的score值
        if (this.score > score){
            System.out.println("恭喜上榜~~");
        }else {
            System.out.println("您落榜了");
        }
    }
}
