package chapter6;

public class MontyHallTester {

    public static void main(String[] args) {

        MontyHall monty = new MontyHall();
        int stayWins = monty.getStayWins();
        System.out.println("Stay wins: " + stayWins);
        System.out.println("Move wins: " + (1000 - stayWins));
    }
}
