public class Array24 {
    public int caculateGCD(int a, int b) {
        int temp = a * b;
        if (a == 0 || b == 0) {
            return (a * b) / (a + b);
        }
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return temp / a;
    }

    public int calculateGCDOfArray(int[] arr) {
        int result = caculateGCD(arr[0], arr[1]);
        for (int i = 2; i < arr.length; i++) {
            result = caculateGCD(result, arr[i]);
        }
        return result;
    }
}
