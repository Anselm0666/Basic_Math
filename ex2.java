package secao4;

public class ex2 {
    public static void main(String[] args) {
 

        int nums = 1;

        while(nums < 20){
            nums++;

            if(nums % 2 == 0){
                System.out.println(nums);
            }else{
                continue;
            }
        }
    }
}
