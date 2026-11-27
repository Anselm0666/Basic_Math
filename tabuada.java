package secao2;
import java.util.Scanner;

public class tabuada {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite um valor para saber sua tabuada: ");
        int num = scanner.nextInt();

        System.out.println(num + "x 1 = " + (num * 1));
        System.out.println(num + "x 2 = " + (num * 2));
        System.out.println(num + "x 3 = " + (num * 3));
        System.out.println(num + "x 4 = " + (num * 4));
        System.out.println(num + "x 5 = " + (num * 5));
        System.out.println(num + "x 6 = " + (num * 6));
        System.out.println(num + "x 7 = " + (num * 7));
        System.out.println(num + "x 8 = " + (num * 8));
        System.out.println(num + "x 9 = " + (num * 9));
        System.out.println(num + "x 10 = " + (num * 10));
        scanner.close();
        
    }
}
