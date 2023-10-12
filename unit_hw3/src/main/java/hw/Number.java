package hw;

public class Number {
    private int n;

    public Number(int n) {
        this.n = n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public boolean evenOddNumber() {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
    public boolean numberInInterval(int minValue, int maxValue) {
        if (n >= minValue && n <= maxValue) return true;
        else return false;
    }
}
