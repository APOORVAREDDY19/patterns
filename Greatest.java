public class Greatest {
    public static void main(String[] args) {
        int i,j,z;
        i=3;
        j=7;
        z=4;

        if(i>j){
            if(i>z){
               System.out.print("i is greater");

            }
        }
        else{
           
            if(j>i){
                if(j>z){
                     System.out.print("j is greater");

                }
                else{
                     System.out.print("z is greater");
                }
            }
        }

    }
    
}
