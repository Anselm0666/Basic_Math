package secao5;
import java.util.Arrays;

public class ex1 {
    public static void main(String[] args) {
    
        int nums[] = {2, 3, 4};
        int smun[] = new int [nums.length];

        for(int i = 0; i < nums.length; i++){
           
            smun[i] = nums[nums.length -1 -i];
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(smun));

    }
}
