import java.util.Scanner;

public class questao10{
       public static void main(String[] args){
              float value;
     
       
              Scanner read = new Scanner(System.in);
              
              System.out.println("Say the values: ");
              value = read.nextFloat();

              while (value >= 1){
                   value = (value/2);
              }    
              System.out.println("The value is: " + value);
           
 }
}
