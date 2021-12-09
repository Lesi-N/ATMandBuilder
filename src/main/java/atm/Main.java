package atm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();

        ATM atm = new ATM();
        atm.processAmount(amount);

    }


}
