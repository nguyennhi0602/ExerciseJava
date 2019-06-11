public class String17 {
    public boolean isBiger(String a, String b) {
        if (a.length() != b.length()) {
            return a.length() > b.length();
        }
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                return a.charAt(i) > b.charAt(i);
            }
        }
        return false;
    }

    public String calculate(String a, String b, int index, int buff) {
        int f = 0;
        int s = 0;
        int indexA = a.length() - index;
        int indexB = b.length() - index;
        if (indexA >= 0) {
            f = a.charAt(indexA) - '0';
        }
        if (indexB >= 0) {
            s = b.charAt(indexB) - '0';
        }
        if (indexA <= 0 && indexB <= 0) {
            return (String.valueOf(f - buff - s));
        }
        return calculate(a, b, ++index, (f - buff - s) < 0 ? 1 : 0) + String.valueOf((f - buff - s) < 0 ? (f + 10 - buff - s) : (f - s));
    }

    public String sub(String a, String b) {
        String big = isBiger(a, b) ? a : b;
        String small = isBiger(a, b) ? b : a;
        return ((isBiger(a, b) ? "" : "-") + calculate(big, small, 1, 0));
    }

    public String calculateResult(String a, String b) {
        String result = sub(a, b);
        int index = 0;
        while (result.charAt(index) == '0') {
            result = result.substring(++index);
            index--;
        }
        return result;
    }
}

