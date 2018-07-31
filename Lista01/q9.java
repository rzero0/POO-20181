import java.util.Scanner;

public class questao9{
       public static void main(String[] args){
              int value1;
              int value2;
              int sum;
              int cont_pair = 0;
              int cont_odd = 0;
              
              Scanner read = new Scanner(System.in);
              
              System.out.println("Say the first value: ");
              value1 = read.nextInt();
              System.out.println("Say the second value: ");
              value2 = read.nextInt(); 
              
              sum = value1 + value2;
            
              if (value1 % 2 == 0){
                 cont_pair ++;
              }
              else{
                 cont_odd ++;
              }
              if (value2 % 2 == 0){
                 cont_pair ++;
              }
              else{
                 cont_odd ++;
              }
              System.out.println("Sum: " + sum);              
              System.out.println("Pair: " + cont_pair); 
              System.out.println("Odd: " + cont_odd); 
 }
}
