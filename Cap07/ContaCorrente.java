
public class ContaCorrente extends Conta {
	
	public void updates(double rate) {
		this.balance += (this.balance  * rate * 2);
	}
	
	public void deposit(double value) {
		this.balance += (value - 0.10);
	}
}
