package adt;

public interface atm {
    public abstract double deposit(double amount);
    public abstract double withdraw(double amount);
    public abstract void showBalance();
    public abstract boolean verifyPin(int atmPin);
}
