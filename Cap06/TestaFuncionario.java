import java.util.Scanner;

class TestaFuncionario {
	static Funcionario[] lista = new Funcionario[999];
	
	public static void main(String[] args) { 
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("How many employees will de registered: ");
		int quant = read.nextInt();
		
		for (int i = 0; i < quant; i++) {
			System.out.println(" ");
			Funcionario f = new Funcionario();
			
			System.out.println("Report the name: ");
			String name = read.next();
			f.setName(name);
			
			System.out.println("Report the Department: ");
			String Department = read.next();
			f.setDepartment(Department);
			
			System.out.println("Report the Salary: ");
			Float salary = read.nextFloat();
			f.setSalary(salary);
			
			System.out.println("Report the Date: ");
			String date = read.next();
			f.setDate(date);
			
			System.out.println("Report the RG: ");
			String rg = read.next();
			f.setRg(rg);
			
			lista[i] = f;
			
		}
		
		for (int i = 0; i < quant; i++) {
			lista[i].show();
		}
	}  
}
