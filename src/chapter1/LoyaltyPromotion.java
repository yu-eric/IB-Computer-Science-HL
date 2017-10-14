package chapter1;

public class LoyaltyPromotion {

    public static void main(String[] args) {
        Double[] eItems = {101.5, 102.7, 99.2, 97.1};
        Double x = Math.abs(eItems[0]-100);
        int pos = 0;
        for(int i = 0; i < eItems.length; i++) {
            Double y = Math.abs(eItems[i] - 100);
            if(y < x) {
                x = y;
                pos = i;
            }
        }
        System.out.println("The e-item priced closest to $100 = $" + eItems[pos]);
    }
}
