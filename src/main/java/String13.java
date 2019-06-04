public class String13 {
    public String deleteDuplicateElement(String str) {
        String result="";
        for (int i = 0; i < str.length(); i++) {
            if (!result.contains(String.valueOf(str.charAt(i)))) {
                result += String.valueOf(str.charAt(i));
            }
        }
        return result;
    }

    public boolean getStringIsValid(String str1, String str2) {
        str1 = deleteDuplicateElement(str1);
        str2 = deleteDuplicateElement(str2);
        boolean check = true;
        for (int i = 0; i < str1.length(); i++) {
            if (!str2.contains(String.valueOf(str1.charAt(i)))) {
                check = false;
            }
        }
        return check;
    }
}
