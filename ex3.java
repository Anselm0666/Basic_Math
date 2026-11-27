package secao2;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Digite um número para saber se é ímpar ou par: ");
        int num = scanner.nextInt();
        String result = "";

        if(num % 2 == 0){
            result = "par.";
        }else{
            result = "ímpar.";
        }

        System.out.println("O número é: " + result);

        scanner.close();
    }
}
