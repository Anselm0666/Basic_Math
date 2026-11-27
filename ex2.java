package secao3;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor digite um número para saber se é par ou ímpar: ");
        int num = scanner.nextInt();

        paridade(num);

        scanner.close();

    }

    public static void paridade(int num){

        if(num % 2 == 0){
            System.out.println(num + " É par.");
        }else{
            System.out.println(num + " É ímpar.");
        }
        
    }
}
