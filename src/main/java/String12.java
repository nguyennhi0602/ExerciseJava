public class String12 {
    public String deleteDuplicateElement(String str){
        String result = "";
        str = str + " ";
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                continue;
            }
            result += String.valueOf(str.charAt(i));
        }
        return result;
    }
}
