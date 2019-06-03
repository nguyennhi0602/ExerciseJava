public class String4 {
    public int calcuateSum(String str) {
        int sum = 0;
        str = str.replaceAll("[^0-9]+", " ").trim();
        String[] temp = str.split(" ");
        for (String s : temp) {
            sum += Integer.parseInt(s);
        }
        return sum;
    }
}
