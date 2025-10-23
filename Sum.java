import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
         System.out.println("enter n:");
         int n= scanner.nextInt(); 
         int sum =0;
         int i=1;
         while(i<=n){
            sum=sum+i;
            i++;
       


         }

 System.out.println("here is the sum  " + sum);
        
    }
}
