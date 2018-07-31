import java.util.Scanner;

public class questao5{
       public static void main(String[] args){
              int month;
              
              System.out.println("Months");
              Scanner read = new Scanner(System.in);

              System.out.print("Say the number of the month(1 to 12): ");
              month = read.nextInt();
              impmonth(month);
}
        static void impmonth(int num){     
             System.out.print("The month is: ");
              switch (num) {   
                   case 12: System.out.println("December");             
                            break;   
                   case 11: System.out.println("November");             
                            break;   
                   case 10: System.out.println("October");             
                            break;   
                   case 9: System.out.println("September");             
                           break;
                   case 8: System.out.println("August");             
                           break;
                   case 7: System.out.println("July");             
                           break;
                   case 6: System.out.println("June");             
                           break;
                   case 5: System.out.println("May");             
                           break;
                   case 4: System.out.println("April");             
                           break;
                   case 3: System.out.println("March");             
                           break; 
                   case 2: System.out.println("February");             
                           break;
                   case 1: System.out.println("January");             
                           break;  
                   default: System.out.println("Error!!!"); 
  }
 }  
}
