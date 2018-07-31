class TestaFuncionario {
	public static void main(String[] args) { 
		
		Funcionario f1 = new Funcionario(); 
		f1.name = "Danilo"; 
		f1.salary = 100.000;
		f1.department = "Gerente";
		f1.date = "16/10/1990";
		f1.rg = "123.1234.1234.14";
		f1.receivesincrease(5.000);
		f1.show();
		

	}  
}
