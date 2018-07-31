
class TestaDeposita {
	public static void main(String[] args) {
		Conta cp = new ContaPoupanca();
		
		try {
			cp.deposit(-100);
		}
		catch (ValorInvalidoException e) {
			e.error();

		}
		
	}
	
}
