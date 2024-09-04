public class DecimalToBinary {
    public static void main(String[] args) {
        decimalToBinary(23); 
        BinaryToDecimal(10);
        AnyBaseToDecimal(101,2);
    }
// Decimal to Binary
    public static void decimalToBinary(int decimalNum) {
        int resNum = 0;
        int power = 0;

        while (decimalNum > 0) {
            int rem = decimalNum % 2;//get the reminder
            decimalNum /= 2;
            resNum += rem * Math.pow(10, power); // Accumulate the binary digits
            power++;
        }

        System.out.println(resNum);
    }


    //Binary to Decimal
    public static void BinaryToDecimal(int BinaryNum) {
        int resltNum = 0;
        int power = 0;
    
        while (BinaryNum > 0) {
            int rem = BinaryNum % 10;  // Get the last binary digit
            resltNum += rem * Math.pow(2, power); // Multiply by 2^power to convert to decimal
            BinaryNum /= 10; // Move to the next digit
            power++;
        }
    
        System.out.println(resltNum);
    }

    
  //Any base to conver decimal to binary
  public static void AnyBaseToDecimal(int BinaryNum ,int anyBase) {
    int resltNum = 0;
    int power = 0;

    while (BinaryNum > 0) {
        int rem = BinaryNum % 10;  // Get the last binary digit
        resltNum += rem * Math.pow(anyBase, power); // Multiply by 2^power to convert to decimal
        BinaryNum /= 10; // Move to the next digit
        power++;
    }

    System.out.println(resltNum);
}

  


}
