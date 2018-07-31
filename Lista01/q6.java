import java.util.Scanner;

public class questao6{
       public static void main(String[] args){
              int days;
              String name;
              System.out.println("Daily");
              Scanner read = new Scanner(System.in);

              System.out.print("Say the number of days you stayed: ");
              days = read.nextInt();
              System.out.print("Say your name: ");
              name = read.next();
              System.out.print(name);
              impvalue(days);
              
}
        static void impvalue(int num){     
             System.out.print(" the value is: ");
             Double total;
             float value = (float) num;
             if (num > 15){
                total = ((60 * value) + (5.50 * value));
                System.out.print(total);
             }
             else if (num == 15){
                total = ((60 * value) + (6.00 * value));
                System.out.print(total);
             }
             else if (num < 15){
                total = ((60 * value) + (8.00 * value));
                System.out.print(total);
             }
             else{
                System.out.print("Error!!!");
             }
 }  
}
