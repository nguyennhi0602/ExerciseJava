public class String14 {
    public boolean isBarcode(String str) {
        if (str.length() != 13) {
            return false;
        }
        int evenNumber = 0;
        int oddNumber = 0;
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                oddNumber += str.charAt(i);
            } else {
                evenNumber += str.charAt(i);
            }
        }
        return (oddNumber + 3 * evenNumber) % 10 == 0;
    }
}
