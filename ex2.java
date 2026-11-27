package secao2;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        
        String ndu = "admin";
        int senha = 1234;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor digite o nome de usuário: ");
        String resposta = scanner.nextLine();

        if(resposta.equals(ndu)){
           System.out.println("Por favor digite a senha: ");
                int resposta2 = scanner.nextInt();

                if(resposta2 != senha){
                    System.out.println("Acesso negado...");
                }else{
                    System.out.println("Seja bem vindo(a) ao sistema!");
                }
        }else{
            System.out.println("Acesso negado...");
        }
        scanner.close();
    }
    
}
