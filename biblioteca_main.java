package secao6;
import java.util.Scanner;

public class biblioteca_main {
    public static void main(String[] args) {
        System.out.println("BEM VINDO(A) A BIBLIOTECA DIGITAL!");
        System.out.println("\n- Digite aqui o gênero da obra que procura e mostraremos o catálogo:");

        Scanner scanner = new Scanner(System.in);
        String opcao = scanner.nextLine();

switch (opcao) {
    case "romance":
        System.out.println("Morro dos Ventos Uivantes - Emily Brontë");
        System.out.println("Romeu e Julieta - Shakespeare");
        System.out.println("Beren e Lúthien - J.R.R. Tolkien");
        break;
    case "ficcao":
        System.out.println("O retrato de Dorian Gray - Oscar Wilde");
        System.out.println("1984 - George Orwell");
        break;
    case "filosofia":
        System.out.println("O anticristo - Friederich Nietzsche.");
        System.out.println("O Princípe - Maquiavel.");
        break;
    case "poesia":
        System.out.println("O corvo - Edgar Allan Poe.");
        break;
    default:
        System.out.println("Não possuímos obras deste gênero.");
}
    }
}


