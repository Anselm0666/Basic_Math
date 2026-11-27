package secao6;
import java.util.Scanner;

public class celular_main {

    public static void main(String[] args) {

        celular g53 = new celular();
        g53.marca = "Motorola";

        celular g04 = new celular();
        g04.marca = "Motorola";


        System.out.println("Deseja usar qual smartphone?");
        System.out.println("1 - moto g53");
        System.out.println("2 - moto g04");
        Scanner scanner = new Scanner(System.in);
        int choice1 = scanner.nextInt();

        switch(choice1){
            case 1:
            g53.main_menu();
            celular.jogar(100);
            break;

            case 2:
            g04.main_menu();
            celular.jogar(100);
            break;
        }
        scanner.close();
    }
}
