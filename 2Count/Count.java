//GFG QUESTION
// Given a number n. Count the number of digits in n which evenly divide n. Return an integer, total number of digits of n which divides n evenly.

import java.util.Scanner;


// Note :- Evenly divides means whether n is divisible by a digit i.e. leaves a remainder 0 when divided.
 
public class Count {
    public static void main(String[] args) {
        count(4567);
    }
        public static void count(int n){
           System.out.print("Enter any digits");
           Scanner sc=new Scanner(System.in);
            n=sc.nextInt();
            int count=0;
        int num=n;
        while(n>0){
            int lastNum=n%10;
            if (lastNum == 0) {
                n = n / 10; // Update N to avoid an infinite loop
                continue;
            }
            if(num%lastNum==0){
                count++;
    
            }
            n=n/10;
        }
        System.out.print(count);
        }
    

     
}
