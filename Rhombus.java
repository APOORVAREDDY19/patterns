public class Rhombus {
    
    public static void main(String[] args) {
        
        int n=5;
        int half=(n/2)+1;
        int lh=half;
        int rh=half;

        int count=1;
        for(int row=1;row<=n;row++)
        {
            for(int column=1;column<=n;column++)
            {
            if(column==rh||column==lh){
               System.out.print(count);
               count++;
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


