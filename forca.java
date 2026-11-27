package secao5;
import java.util.Arrays;
import java.util.Scanner;

public class forca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tentativas = 6;
        boolean win = false;

        System.out.println("Digite em maiúsculo a palavra a ser descoberta: ");
        String secreta = scanner.nextLine();

        char[] oculta = new char[secreta.length()];

        for(int i = 0; i < secreta.length(); i++){
            oculta[i] = '_';
        }
        System.out.println(Arrays.toString(oculta));


        while(tentativas > 0){
            System.out.println("palavra: " + String.valueOf(oculta));
            System.out.println("Tentativas restantes: " + tentativas);
            System.out.println("Digite uma letra: ");

            char letra = scanner.next().toUpperCase().charAt(0);

            System.out.println(letra);

            boolean acertou = false;

            for(int i = 0; i < secreta.length(); i++){

                if(secreta.charAt(i) == letra){
                    oculta[i] = letra;
                    acertou = true;
                }

            }

            if(!acertou){
                tentativas--;
                System.out.println("letra incorreta.");
            }else{
                System.out.println("letra correta!");
            }

            if(String.valueOf(oculta).equals(secreta)){
                win = true;
                break;
            }

           
        }

        if(win){
            System.out.println("Parabéns você acertou! ainda restavam " + tentativas + " tentativas!");
        }else{
            System.out.println("Você perdeu...");
        }
            System.out.println("A palavra era: " + secreta);
        
        scanner.close();
    }
}
