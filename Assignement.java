public class Assignement {
    
    public static void main(String[] args) {
        int n=5;
        int half=(n/2)+1;
        int lh =(n/2)+1;
        int rh=(n/2)+1;
        for(int row=1;row<=n;row++)
        {
            for(int column=1;column<=n;column++)
            {
            if(column==rh||column==lh){
               System.out.print("*");
               }
               else{
                System.out.print(" ");
                
               }
               

            }
            if(row< half)
            {
                lh -= 1;
                rh += 1;
            }
            else{
                lh += 1;
                rh -= 1;
            }
            System.out.println();
        }


    }
}
