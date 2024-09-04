public class Revers {
    public static void main(String[] args) {
        reverseNum(2345);
    }

    //reverse Num
    public static void reverseNum(int N){
        int reverseNum=0;
        while(N>0){
            int digit=N%10;
            reverseNum=reverseNum*10+digit;
            N/=10;
        }
        System.out.print(reverseNum);
    }
}
