

public class onlyCount {
    public static void main(String[] args){
        //countNum(4538);
        usingLogCountNum(789709);
    }

       //only count number
       public static void countNum(int n){
        int countNum=0;
        while(n>0){
           n/=10;
           countNum++;
        }
        System.out.print(countNum);
    }

    //log metho count number
    public static void usingLogCountNum(int n){
        if(n==0){
            return;
        }
        int countNum = (int)((int)Math.log(n) / Math.log(10))+1;
        System.out.print(countNum);
    }
}
