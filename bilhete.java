package secao6;
import java.util.Random;
import java.util.Arrays;

public class bilhete {
    private int chosen_nums[];
    private int result_sort[];

    public bilhete(int[] chosen_nums) {
        this.chosen_nums = chosen_nums;
    }

    public void realizarSorteio(){

        Random random = new Random();

        result_sort = new int[6];

        for(int i = 0; i < result_sort.length; i++){

            result_sort[i] = random.nextInt(60) + 1;
        }

        Arrays.sort(result_sort);
    }

    public int contarAcertos(){

        int acertos = 0;

        for(int chosen_num : chosen_nums){
            for(int numSort : result_sort){
                if(chosen_num == numSort){
                    acertos++;
                }
            }
        }

        return acertos;

    }

    public void exibirResultados(){
        System.out.println("Numeros escolhidos: " + Arrays.toString(chosen_nums));
        System.out.println("Numeros sorteados: " + Arrays.toString(result_sort));

        int acertos = contarAcertos();

        System.out.println("Você acertou " + acertos + " acertos");
        System.out.println();
        
    }
}
