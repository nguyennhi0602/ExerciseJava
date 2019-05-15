public class Exercise18 {
    public String getBinaryByDecimal(int decimalNumber){
        return Integer.toBinaryString(decimalNumber);
    }
    public int getDecimalByDecimal(int number){
        int result=0;
        String binaryNumber=getBinaryByDecimal(number);
        for(int i=0;i<binaryNumber.length();i++){
            result+=Integer.parseInt(String.valueOf(binaryNumber.charAt(i)))* Math.pow(2,i);
        }
        return result;
    }
}
