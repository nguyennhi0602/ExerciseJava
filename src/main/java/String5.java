public class String5 {
    public String findDuplicateElement(String str) {
        String[] temp = str.split("[ ]+");
        String result = "";
        for (int i = 0; i < temp.length; i++) {
            int count = 0;
            for (int j = i + 1; j < temp.length; j++) {
                if (temp[i].equals(temp[j])) {
                    count++;
                }
                if (count == 2) {
                    result += temp[i] + ", ";
                    break;
                }
            }
        }
        return result.substring(0, result.length() - 2);
    }
}
