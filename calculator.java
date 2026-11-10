package secao4;
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("   === CALCULADORA ===");

        System.out.println("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.println("Agora digite o segundo número: ");
        int num2 = scanner.nextInt();

        System.out.println("Escolha a operação: \n 1) Soma \n 2) Substração \n 3) Multiplicação \n 4) Divisão");
        int choice = scanner.nextInt();

        switch(choice){
            case 1:
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                
            break;

            case 2:
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
            break;

            case 3:
                System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
            break;

            case 4:
                System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
            break;
            default:
                System.out.println("Opção invalida!");
        }

        scanner.close();
    }
}
