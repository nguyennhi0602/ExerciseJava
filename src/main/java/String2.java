public class String2 {

    public String getWordIsValid(String str) {
        String result = "";
        String[] words = str.split("[ ]+");
        for (String word : words) {
            if (word.matches("[a-zA-Z0-9]+") == true) {
                result += word + ", ";
            }
        }
        return result.substring(0, result.length() - 2);
    }
}
