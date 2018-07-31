import java.util.Scanner;

public class questao8{
       public static void main(String[] args){
              int smaller = 9999;
              int bigger  = 0;
              double average;
              int i, value;
              int sum = 0;
                 
              Scanner read = new Scanner(System.in);

              for (i = 0; i <= 10; i++){
                  System.out.println("Say the values: ");
                  value = read.nextInt();
                  
                  sum += value;
                  if (value > bigger){
                     bigger = value;
                  }
                  if (value < smaller){
                     smaller = value;
                  }
                   
              }
              average = (sum / 10);
              
              System.out.println("Smaller: " + smaller);
              System.out.println("Bigger: " + bigger);
              System.out.println("Average: " + average);
 }
}
