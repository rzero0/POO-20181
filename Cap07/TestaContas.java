
public class TestaContas {
	public static void main(String[] args) { 
		Conta c = new Conta(); 
		Conta cc = new ContaCorrente(); 
		Conta cp = new ContaPoupanca();
		c.deposit(1000); 
		cc.deposit(1000); 
		cp.deposit(1000);
		c.updates(0.01); 
		cc.updates(0.01); 
		cp.updates(0.01);
		System.out.println(c.getBalance()); 
		System.out.println(cc.getBalance()); 
		System.out.println(cp.getBalance());
	}

}
