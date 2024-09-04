
public class evenOdd {
    public static void main(String[] args) {
        checkEvenOdd(45);
    }

    public static void checkEvenOdd(int n){
       if(n%2==0){
        System.out.print("Yor Number is Even"+ " "+n);
      }else{
        System.out.print("Your Number is Odd"+" "+ n);
      }
    }
}
