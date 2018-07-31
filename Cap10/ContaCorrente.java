
class ContaCorrente extends Conta implements Tributavel{
	
	public void updates(double rate) {
		this.balance += (this.balance  * rate * 2);
	}
	
	public void deposit(double value) {
		this.balance += (value - 0.10);
	}
	
	public double calculateTaxes() {
		return (this.getBalance() * 0.01);
	}
	
}
