package secao4;
import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para saber quantos digitos ele possui: ");
        int num = scanner.nextInt();
        int contador = 0;

        while(num != 0){
            num = num / 10;

            contador++;
        }
        
        System.out.println("Número de digitos deste número: " + contador);

        scanner.close();
    }
}
