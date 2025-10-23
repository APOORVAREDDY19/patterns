import java.util.Scanner;
public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER");
        int NUMBER=scanner.nextInt();
        
        

        if(NUMBER%2==0){
            System.out.println("the number is even "+NUMBER);

        }
        else{
            System.out.println("the number is odd "+NUMBER);
        }
          

        
    }
    
}
