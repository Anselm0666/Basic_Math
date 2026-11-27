package secao3;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {

        conversao();
    }

    public static void conversao(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma temperatura em Celsius para converte-la em Fahrenheit: ");
        Double c = scanner.nextDouble();

        Double f = c * 1.8 + 32;

        System.out.println("Sua temperatura convertida é: " + f + " ºF");

        scanner.close();
    }
}
