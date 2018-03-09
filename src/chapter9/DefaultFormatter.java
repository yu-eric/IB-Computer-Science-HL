package chapter9;

public class DefaultFormatter implements NumberFormatter{
    @Override
    public String format(int n) {
        return Integer.toString(n);
    }
}
