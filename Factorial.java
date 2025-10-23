import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the number");
        int number=scanner.nextInt();
        int Fact=1;
        int i;
        for(i=1;i<=number;i++){
            Fact=Fact*i;   
        }
        System.out.println("factorial;"+Fact);


        
    }
    
}
