package secao4;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("O que procura? \n1) Doces \n2) Bebidas \n3) Lanches \n4) Sair \n");
        int choice = scanner.nextInt();
        boolean x = true;

       switch(choice){
        case 1:
            x = true;
        break;
        case 2:
            x = true;
        break;
        case 3:
            x = true;
        break;
        case 4:
            x = false;
        break;
       }

        do{
            System.out.println("Aguarde um momento...");
        }while(x == true);

        System.out.println("Saindo do sistema...");
        System.exit(0);

        scanner.close();
    }
}
