package chapter9;

public class AccountingFormatter implements NumberFormatter {
    @Override
    public String format(int n) {
        return "(" + (n * -1) + ")";
    }
}
