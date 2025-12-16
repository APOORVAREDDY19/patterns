public class W
{
    public static void main(String[] args) 
    {
        int n= 5;
        int mid=(n/2)+1;
        for(int row=1;row<=n;row++)
        {
            for(int column=1;column<=n;column++)
            {
            if(column==1||column==n||(row >= (n/2)+1 && (row==column|| row + column == n + 1)))               {
                System.out.print("*");

               }
            else
                         {
                System.out.print(" ");
                         }
            }
            System.out.println();
        }
    }
    
}
