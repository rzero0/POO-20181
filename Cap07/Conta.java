
public class Conta {
	protected double balance;
	
	
	public void deposit(double value) {
		this.balance += value;
	}
	public void withdraw(double value) {
		this.balance -= value;
	}
	public double getBalance() {
		return this.balance;
	}
	public void updates(double rate) {
		this.balance += (this.balance * rate);
	}
	
}
