
public class ContaPoupanca extends Conta {
	
	public void updates(double rate) {
		this.balance += (this.balance  * rate * 3);
	}
}
