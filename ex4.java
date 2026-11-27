package secao3;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Por favor digite aqui a sua idade: ");
        int age = scanner.nextInt();

        checker(age);

        scanner.close();
    }

    public static void checker(int age){

        if(age < 18){
            System.out.println("Acesso negado");
            System.exit(0);
        }else{
            System.out.println("Acesso permitido.");
        }

    }

}
