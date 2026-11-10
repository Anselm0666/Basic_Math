package secao4;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para saber se é primo: ");
        int num = scanner.nextInt();

        boolean eprimo = true;

        for(int i = 2; i < num; i++){

            if(num % i == 0){
                eprimo = false;
                break;
            }
        }

        if(eprimo){
            System.out.println("O número " + num + " é primo!");
        }else{
            System.out.println("Não é primo!");
        }
        scanner.close();
    }
}
