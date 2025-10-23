public class Swastik1
{
    public static void main(String[] args) 
    {
        int n= 5;
        for(int row=1;row<=n;row++)
        {
            for(int column=1;column<=n;column++)
            {
            if(row==(n/2)+1||column==(n/2)+1||row==1&&column<(n/2)+1||column==1&&row>(n/2)+1||column==5&&row<(n/2)+1||row==5&&column>(n/2)+1){
               System.out.print("*");
            }
                else{

                    System.out.print(" ");
                }

                
            
            }
            System.out.println();

        }

           
    
    }

    
}
