public class String15 {
    public int findVerifyNumber(String str) {
        int evenNumber = 0;
        int oddNumber = 0;
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                oddNumber += str.charAt(i) - '0';
            } else {
                evenNumber += str.charAt(i) - '0';
            }
        }
        if ((oddNumber + 3 * evenNumber) % 10 != 0) {
            return 10 - (oddNumber + 3 * evenNumber) % 10;
        }
        return 0;
    }
}
