public class Exercise6 {
    public String sloveEquation(double a, double b, double c) {
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    return "Phuong trinh vo so nghiem";
                }
                return "Phuong trinh vo nghiem";
            }
            return "Phuong trinh co nghiem: " + (-c / b);
        }
        double x1, x2, delta;
        delta = b * b - 4 * a * c;
        if (delta < 0) {
            return "Phuong trinh vo nghiem";
        }
        if (delta == 0) {
            x1 = x2 = (-b / (2 * a));
            return "Phuong trinh co nghiem kep: " + x1;
        }
        x1 = (-b + Math.sqrt(delta)) / (2 * a);
        x2 = (-b - Math.sqrt(delta)) / (2 * a);
        return "Phuong trinh co hai nghiem x1= " + x1 + " x2= " + x2;
    }
}
