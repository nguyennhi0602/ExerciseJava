public class String15 {
    public int findVerifyNumber(String str) {
        int evenNumber = 0;
        int oddNumber = 0;
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                System.out.println( str.charAt(i));
                oddNumber += Character.getNumericValue(str.charAt(i));
                System.out.println(oddNumber+","+str.charAt(i));
            } else {
                evenNumber += str.charAt(i)-0;
            }
        }
        System.out.println(oddNumber);
        int sum = oddNumber + 3 * evenNumber;
        System.out.println(sum);
        if (sum % 10 != 0) {
            return 10 - (sum % 10);
        }
//        return 0;
        System.out.println(oddNumber + 3 * evenNumber);
        System.out.println((oddNumber + 3 * evenNumber)%10);
        return 10-(oddNumber + 3 * evenNumber)%10;
    }
}
