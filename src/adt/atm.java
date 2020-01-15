package adt;

public interface atm {
    public abstract double deposit();
    public abstract double withdraw();
    public abstract void showBalance();
    public abstract boolean verifyPin();
}
