
public abstract class Conta {
	protected double balance;
	
	
	public void deposit(double value) {
		if (value < 0) {
			throw new ValorInvalidoException();
		}
		else {
			this.balance += value;
		}
	}
	public void withdraw(double value) {
		this.balance -= value;
	}
	public double getBalance() {
		return this.balance;
	}
	public abstract void updates(double rate);
	
}
