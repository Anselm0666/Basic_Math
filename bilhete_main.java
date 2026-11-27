package secao6;
import java.util.ArrayList;
import java.util.Scanner;

public class bilhete_main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        ArrayList<bilhete> bilhetes = new ArrayList<>();

        while(true){

            System.out.println("Digite 6 numeros para o seu bilhete, entre 1 e 60");

            int[] chosen_nums = new int[6];

            for(int i = 0; i < chosen_nums.length; i++){

                System.out.println("Digite o numero " + (i + 1) + ": ");
                chosen_nums[i] = scanner.nextInt();
            }

            bilhete bilhete = new bilhete(chosen_nums);
            bilhetes.add(bilhete);

            System.out.println("Deseja registrar outro bilhete? (s/n)");

            String resposta = scanner.next();

            if(resposta.equals("n")){
                break;
            }
        }

        System.out.println("Realizando o sorteio...");

        for(bilhete bilhete : bilhetes){
            bilhete.realizarSorteio();
            bilhete.exibirResultados();
        }

        scanner.close();
    }
}
