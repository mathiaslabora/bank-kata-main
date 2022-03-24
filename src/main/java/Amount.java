public class Amount {
    public int amount;

    public Amount(int amount) {
        this.amount = amount;
    }

    public void deposit(int amount) {
        this.amount = this.amount + amount;
    }

    public void withdraw(int amount) {
        this.amount = this.amount - amount;
    }

    public int getAmount() {
        return amount;
    }
}
