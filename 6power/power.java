

public class power {
    public static void main(String[] args) {
        //Power(2,3);
        otherMethodOfPower(4,4);
    }

    //powrer usint Math.pow()
    public static void Power(int number,int base){
        int resultPowerInt = (int) Math.pow(number, base);
       System.out.print(resultPowerInt);
    }

    //secont method without Math.pow()
    public static void otherMethodOfPower(int number,int power){
        int resultPowerInt =1;
        for(int i=0; i<power; i++ ){
           resultPowerInt=resultPowerInt*number;
        }
       System.out.print(resultPowerInt);
    }
}


