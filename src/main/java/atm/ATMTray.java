package atm;

public class ATMTray implements Tray {
    private int bill;
    private Tray trayNext;
    public ATMTray(int bill) {
        this.bill = bill;
    }
    @Override
    public void process(int amount) {
        System.out.println(bill + " bills : " + amount / bill);
        if (trayNext != null){
            trayNext.process(amount % bill);
        }
    }

    @Override
    public void setNext(Tray tray) {
        this.trayNext = tray;
    }
}
