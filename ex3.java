package secao3;
import java.util.Scanner;


public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor digite aqui a sua nota para saber em qual classificação se encontra: ");
        int nota = scanner.nextInt();

        classificacao(nota);
        
        scanner.close();
    }

    public static void classificacao(int nota){

        if(nota < 0 || nota > 10){
            System.out.println("Nota inválida...");
            return;
        }

        switch(nota){

            case 10:
                System.out.println("Parabéns! Você se encontra no grupo A");
            break;

            case 9:
                System.out.println("Parabéns! Você se encontra no grupo A");
            break;

            case 8:
                System.out.println("Você se encontra no grupo B");
            break;

            case 7:
                System.out.println("Você se encontra no grupo C");
            break;

            case 6:
                System.out.println("Parabéns! Você se encontra no grupo D");
            break;

            default:
                System.out.println("Você se encontra no grupo F");
            break;
        }
    }
}
