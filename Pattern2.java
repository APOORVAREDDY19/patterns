public class Pattern2 {
    public static void main(String[] args) {
         int n=4;
        
        for (int row = 1; row <= n; row++) {
            for (int column = 1; column <=n-row+1 ; column++) {
                System.out.print("* ");
                
            }
            System.out.println();
        }
            
        

    }  
    
}
