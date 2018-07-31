import java.util.Scanner;

public class questao1{
       public static void main(String[] args){
              Double speed;
              Double km;
              System.out.println("Speed Converter (m/s to km/h)");
              Scanner read = new Scanner(System.in);
              System.out.println("Report the speed in (m/s): ");
              speed = read.nextDouble();
              km = speed * 3.6;
              System.out.print(km);
              System.out.println("km/h");
 }
}
