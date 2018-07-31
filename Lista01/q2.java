import java.util.Scanner;

public class questao2{
       public static void main(String[] args){
              int year;
              int age = 0;
              System.out.println("Age");
              Scanner read = new Scanner(System.in);
              System.out.println("Say the year: ");
              year = read.nextInt();
              age = 2017 - year;
              System.out.print(age);

 }
}
