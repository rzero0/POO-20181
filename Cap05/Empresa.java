public class Empresa {
	Funcionario[] employees;
	String cnpj;
	int num;
	

	public Empresa() {
		this.num = 0;
		employees = new Funcionario[10];
	}
	
	public void add(Funcionario pessoa) {	
			employees[num] = pessoa;
			num++;

    }

}



