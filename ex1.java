package secao2;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor insira aqui o preço do produto que deseja comprar: ");
        double preco = scanner.nextInt();

            if (preco < 50){
                System.out.println(preco);
                System.out.println("Produto é barato!");
            }else if (preco >= 50 && preco <= 100){
                System.out.println(preco);
                System.out.println("Produto é médio!");
            }else{
                System.out.println(preco);
                System.out.println("Produto é caro!");
            }
            scanner.close();
    }
    
}
