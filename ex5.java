package secao5;
import java.util.Arrays;
import java.util.ArrayList;


public class ex5 {
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 2, 4, 4, 5};
        ArrayList<Integer> array2 = new ArrayList<>();

        System.out.println(Arrays.toString(array));

        for(int num : array){
            if(!array2.contains(num)){
                array2.add(num);
            }
        }
        System.out.println(array2);
    }
}
