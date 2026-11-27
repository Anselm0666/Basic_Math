package secao5;
import java.util.Arrays;

public class ex3 {
    public static void main(String[] args) {
        int matriz[][] = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int matriz2[][] = new int[matriz[0].length][matriz.length];

        
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[0].length; j++){
                matriz2[j][i] = matriz[i][j];
            }
        }

          for(int[] linha : matriz2){
            System.out.println(Arrays.toString(linha));
        }
    }
}
