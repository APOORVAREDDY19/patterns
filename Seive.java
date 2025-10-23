import java.util.Arrays;
public class Seive{
    public static void main(String[] args) {
        boolean[] bool = new boolean[18];
        for(int i=2; i<18; i++){
            if(bool[i] != true){
                for(int j=i*2; j<18; j=j+i){
                    bool[j] = true;
                }

            }
            
        }
        for(int i=2; i<18; i++){
            if(bool[i] == false){
                System.out.print(i+" ");
            }
        }
        // System.out.println(Arrays.toString(bool));

    }
}