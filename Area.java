
import java.util.Scanner;


public class Area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter length of rectangle");
        int length = scanner.nextInt();


        System.out.println("enter width od rectangle");
        int width=scanner.nextInt();
        int area=0;


        area = length *width;
        System.out.println(area);
        scanner.close();

        
    }
    
}
