package banks;

import adt.atm;

public class IOBATM implements atm {
    @Override
    public double deposit(double amount) {
        return 1_00_000.0;
    }

    @Override
    public boolean verifyPin(int atmPin) {
        return false;
    }

    @Override
    public double withdraw(double amount) {
        return 0;
    }

    @Override
    public void showBalance() {
        System.out.println("0.0");
    }
}
