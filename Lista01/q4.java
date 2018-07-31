import java.util.Scanner;

public class questao4{
       public static void main(String[] args){
              float first;
              float second;
              float third;
              float fourth;
           
              float media;
            
              System.out.println("Final media");
              Scanner read = new Scanner(System.in);

              System.out.println("Say the First note: ");
              first = read.nextFloat();
              System.out.println("Say the Second note: ");
              second = read.nextFloat();
              System.out.println("Say the Third note: ");
              third = read.nextFloat();
              System.out.println("Say the Fourth note: ");
              fourth = read.nextFloat();
              
              media =  (first + second + third + fourth)/4;                
 
              System.out.print("The Media is: ");
              System.out.println(media);

              if (media >= 7.0){
                 System.out.println("Approved");
              }
              else if (5.0 <= media && media > 7.0){
                 System.out.println("Final");
              }
              else if (5.0 > media){
                 System.out.println("Disapproved");
              }
              else{
                 System.out.println("Error!!!");
              }
 }
}
