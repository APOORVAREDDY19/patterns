import java.util.Scanner;
public class Positive {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number");
        double number = scanner.nextDouble();

        if(number>0){
            System.out.println("the given number is positive");
        }
        else if (number==0){
            System.out.println("the given number is null");
        }
        else{
            System.out.println("the given number is negative");
        }
        }
    
}
