import java.util.Scanner;

public class questao7{
       public static void main(String[] args){
              int note;
            
              System.out.println("Concept");
              Scanner read = new Scanner(System.in);

              System.out.println("Say the First note: ");
              note = read.nextInt();
              
              System.out.print("The Concept is: ");
              System.out.println(note);

              if (0 <= note && note <= 49){
                 System.out.println("Insufficient");
              }
              else if (50 <= note && note <= 64){
                  System.out.println("Regular");
                  }          
              
              else if (65 <= note && note <= 84){
                  System.out.println("Good");
                  }          
              
              else if (85 <= note && note <= 100){
                  System.out.println("Great");
                  }          
              
              else{
                  System.out.println("Error!!!");
              }
 }
}
