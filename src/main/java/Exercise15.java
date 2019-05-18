import java.text.DecimalFormat;

public class Exercise15 {
    private static DecimalFormat df=new DecimalFormat("0.0");
    public boolean isRightTriangle(double a, double b, double c) {
        return (Math.pow(a, 2) + Math.pow(b, 2)) == Math.pow(c, 2) ||
                (Math.pow(a, 2) + Math.pow(c, 2)) == Math.pow(b, 2) ||
                (Math.pow(b, 2) + Math.pow(c, 2)) == Math.pow(a, 2);
    }

    public double getArea(double a, double b, double c) {
        double cv = (a + b + c) / 2;
        return Math.sqrt(cv * (cv - a) * (cv - b) * (cv - c));
    }


    public String infoTriangle(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0 || a >= b + c || c >= b + a || b >= a + c) {
            return "tam giac khong hop le";
        }
        String result=" chu vi " + df.format(a + b + c) + " dien tich " + df.format(getArea(a, b, c));
        if (a == b && b == c) {
            return "tam giac deu"+result;
        }
        if (b == c || a == b || c == a) {
            return "tam giac can"+result;
        }
        if (isRightTriangle(a, b, c)) {
            return "tam giac vuong"+result;
        }
        return "tam giac binh thuong"+result;
    }

}
