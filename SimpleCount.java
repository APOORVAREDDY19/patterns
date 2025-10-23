import java.util.Scanner;

public class SimpleCount {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number");
        int number= scanner.nextInt();
        int count=0;
        System.out.println("starting");
        int i = 1;
        while(i>=1)
        {
            count = count-i;
            i--;
        }
System.out.println(i);
System.out.println("here is the blast");

        

    }
    
}
