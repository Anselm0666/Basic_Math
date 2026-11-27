package secao5;
import java.util.Arrays;

public class ex4 {
    public static void main(String[] args) {
        int array[] = {-1, 0, 1, -2, 2, -3};

        System.out.println(Arrays.toString(array));

        for(int i = 0; i < array.length; i++){
            if(array[i] < 0){
                array[i] = 0;
            }
            System.out.println(array[i]);
        }

        System.out.println(Arrays.toString(array));
    }
    
}
