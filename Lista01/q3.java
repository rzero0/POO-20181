import java.util.Scanner;

public class questao3{
       public static void main(String[] args){
              float first;
              float second;
              float third;
              float first_note;
              float second_note;
              float third_note;
              float media;
            
              System.out.println("Final media");
              Scanner read = new Scanner(System.in);

              System.out.println("Say the First note: ");
              first = read.nextFloat();
              System.out.println("Say the Second note: ");
              second = read.nextFloat();
              System.out.println("Say the Third note: ");
              third = read.nextFloat();
              
              first_note = (first * 2)/10;
              second_note = (second * 3)/10;
              third_note = (third * 5)/10;

              media =  (first_note + second_note + third_note);                
 
              System.out.print("The Media is: ");
              System.out.println(media);
 }
}
