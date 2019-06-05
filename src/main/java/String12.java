public class String12 {
    public String deleteDuplicateElement(String str){
        StringBuffer result = new StringBuffer();
        str = str + " ";
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                continue;
            }
            result.append(str.charAt(i));
        }
        return result.toString();
    }
}
