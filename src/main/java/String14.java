public class String14 {
    public boolean isBarcode(String str) {
        if (str.length() != 13) {
            return false;
        }
        int evenNumber = 0;
        int oddNumber = 0;
        for (int i = 0; i < str.length(); i++) {
            if ((i + 1) % 2 != 0) {
                oddNumber += Integer.parseInt(String.valueOf(str.charAt(i)));
            } else {
                evenNumber += Integer.parseInt(String.valueOf(str.charAt(i)));
            }
        }
        int sum = oddNumber + 3 * evenNumber;
        if (sum % 10 == 0) {
            return true;
        }
        return false;
    }
}
