import java.util.Scanner;

public class questao11{
	public static void main(String[] args){
             float total = 0;
             float discount = 0;
             float total_dis = 0;
             int i;             

             Scanner read = new Scanner(System.in);
              
             System.out.println("Menu"); 
             System.out.println("Code     Product          Price");
             System.out.println(" 10    Pastel de carne    1.50");
	     System.out.println(" 11    Coxinha de frango  1.80");
             System.out.println(" 12    Empada de frango   1.90");
             System.out.println(" 20    Hamburguer         10.00");
             System.out.println(" 30    Pizza              8.00");
             System.out.println(" 50    Suco               2.50");
 
             System.out.println("Say the amount of products: "); 
             int quant_product = read.nextInt();

             for (i = 0; quant_product > i; i++){
                 System.out.println("Say the code of the products: ");
                 int code = read.nextInt();

                  if (code == 10){
                     total += 1.50;
                  }
                  else if (code == 11){
                     total += 1.80;
                  }
                  else if (code == 12){
                     total += 1.90;
                  }
                  else if (code == 20){
                     total += 10.00;
                  }
                  else if (code == 30){
                     total += 8.00;
                  }
                  else if (code == 50){
                     total += 2.50;
                  }
              }
              if (total >= 50){
                 discount = ((total*5)/100);
                 total_dis = (total - discount);
                 System.out.println("Total to pay: " + total_dis);
              }
              else{
                  System.out.println("Total to pay: " + total);
              }
 } 
} 
