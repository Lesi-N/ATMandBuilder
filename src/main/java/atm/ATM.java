package atm;

public class ATM {
    private ATMTray first;

    public ATM() {
        FiveTray fiveTray = new FiveTray();
        TenTray tenTray = new TenTray();
        TwentyTray twentyTray = new TwentyTray();

        twentyTray.setNext(tenTray);
        tenTray.setNext(fiveTray);

        first = twentyTray;
    }

    public void processAmount(int amount){
        if (amount % 5 == 0) {
            first.process(amount);
        } else {
            throw new IllegalArgumentException();
        }

    }
}
