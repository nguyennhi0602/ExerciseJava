public class String3 {
    public boolean isSymmetryString(String str) {
        String reverse = new StringBuilder(str).reverse().toString();
        if (str.equals(reverse)) {
            return true;
        }
        return false;
    }
}
