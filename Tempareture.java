
import java.util.Scanner;
public class Tempareture {
    
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the celsius");
        float celsius= scanner.nextFloat();
        float fahrenheit;
        fahrenheit=(celsius*2)+173;
        System.out.println(fahrenheit);
        scanner.close();

    }
}
