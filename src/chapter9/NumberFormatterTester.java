package chapter9;

public class NumberFormatterTester {

    public static void main(String[] args) {

        DecimalSeparatorFormatter decimal = new DecimalSeparatorFormatter();
        AccountingFormatter accounting = new AccountingFormatter();
        DecimalSeparatorFormatter def = new DecimalSeparatorFormatter();
        BaseFormatter base = new BaseFormatter(36);

        System.out.println(decimal.format(1234567));
        System.out.println(accounting.format(-123));
        System.out.println(def.format(12));
        System.out.println(base.format(123123123));
    }
}
