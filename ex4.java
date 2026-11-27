package secao2;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número de 1 a 7 para saber que dia da semana é: ");
        int day = scanner.nextInt();

        switch(day){

            case 1:
                System.out.println("Hoje é Domingo.");
            break; 

            case 2:
                System.out.println("Hoje é Segunda-Feira.");
            break;

            case 3:
                System.out.println("Hoje é Terça-Feira.");
            break;

            case 4:
                System.out.println("Hoje é Quarta-Feira.");
            break;

            case 5:
                System.out.println("Hoje é Quinta-Feira.");
            break;

            case 6:
                System.out.println("Hoje é Sexta-Feira.");
            break;

            case 7:
                System.out.println("Hoje é Sábado.");
            break;
            }

        if(day > 1 && day < 7){
            System.out.println("Hoje é um dia útil!");
    }else{
        System.out.println("Hoje não é um dia útil!");
        }

        
        scanner.close();
    }
}
