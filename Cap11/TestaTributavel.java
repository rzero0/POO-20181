
class TestaTributavel {
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(); 
		cc.deposit(100); 
		System.out.println(cc.calculateTaxes());
		
		Tributavel t = cc; 
		System.out.println(t.calculateTaxes());

	}
}
