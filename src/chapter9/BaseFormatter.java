package chapter9;

public class BaseFormatter implements NumberFormatter{

    int base;

    public BaseFormatter(int base) {
        this.base = base;
    }

    @Override

    public String format(int n) {
        return Integer.toString(n, base);
    }
}
