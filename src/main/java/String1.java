public class String1 {

    public String[] getStringIsValid(String str) {
        String[] result = str.split("[.,;,!,\n]+");
        return result;
    }
}
