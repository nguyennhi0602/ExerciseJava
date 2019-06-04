public class String8 {
    public String standardizeString(String str) {
        String[] sign = str.replaceAll("[^.,;,?,!]+", " ").trim().split(" ");
        String[] temp = str.replaceAll("[ ]+", " ").split("[.,;,?,!]+");
        String result = "";
        for (int i = 0; i < temp.length; i++) {
            if (i == temp.length - 1) {
                result += String.valueOf(temp[i].charAt(0)).toUpperCase() + temp[i].substring(1);
            }else{
                result += String.valueOf(temp[i].charAt(0)).toUpperCase() + temp[i].substring(1) + sign[i] + " ";
            }
        }
        return result;
    }
}
