public class Calculator {
    private int x1;
    private int x2;
    private String sign;

    public static void sum(int x1, int x2) {
        System.out.println(x1 + x2);
    }

    public static void minus(int x1, int x2) {
        System.out.println(x1 - x2);
    }

    public static void multiply(int x1, int x2) {
        System.out.println(x1 * x2);
        System.out.println();
    }

    public static void division(int x1, int x2) {
        System.out.println(x1 / x2);
    }

    public void choice() {
        if (this.sign.equals("+")) {
            sum(this.x1, this.x2);
        }
        if (this.sign.equals("-")) {
            minus(this.x1, this.x2);
        }
        if (this.sign.equals("*")) {
            multiply(this.x1, this.x2);
        }
        if (this.sign.equals("/")) {
            division(this.x1, this.x2);
        }

    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }
}
