public class String7 {
    public int getIndexOfSubString(String str, String subStr) {
        int index = 0;
        String temp = new String(str);
        while (temp.contains(subStr)) {
            index++;
            temp = str.substring(index, str.length());
        }
        return index - 1;
    }
}
