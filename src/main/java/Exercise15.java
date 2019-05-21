import java.text.DecimalFormat;

public class Exercise15 {
    private static DecimalFormat df=new DecimalFormat("0.0");

    public boolean isRightTriangle(double a, double b, double c) {
        return (a * a + b * b) == (c * c) ||
                (a * a + c * c) == b * b ||
                (b * b + c * c) == a * a;
    }

    public double getArea(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }


    public String infoTriangle(double a, double b, double c) {
        double p = (a + b + c) / 2;
        if (a <= 0 || b <= 0 || c <= 0 || a >= p || c >= p || b >= p) {
            return "tam giac khong hop le";
        }

        String result=" chu vi " + df.format(a + b + c) + " dien tich " + df.format(getArea(a, b, c));
        if (a == b && b == c) {
            return "tam giac deu" + result;
        }
        if ((b - c) * (b - a) * (a - c) == 0) {
            return "tam giac can" + result;
        }
        if (isRightTriangle(a, b, c)) {
            return "tam giac vuong" + result;
        }
        return "tam giac binh thuong" + result;
    }

}
