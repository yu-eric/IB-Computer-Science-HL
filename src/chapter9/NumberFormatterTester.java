package chapter9;

public class NumberFormatterTester {

    public static void main(String[] args) {

        DecimalSeparatorFormatter decimal = new DecimalSeparatorFormatter();
        AccountingFormatter accounting = new AccountingFormatter();
        DecimalSeparatorFormatter def = new DecimalSeparatorFormatter();
        int baseNum = 23;

        if(baseNum >= 2 && baseNum <= 36) {
            //baseNum stays the same
        } else {
            baseNum = 10;
        }
        BaseFormatter base = new BaseFormatter(baseNum);


        System.out.println(decimal.format(1234567));
        System.out.println(accounting.format(-123));
        System.out.println(def.format(12));
        System.out.println(base.format(123123123));
    }
}
