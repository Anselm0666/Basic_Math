package secao6;
import java.util.Scanner;


    public class celular {

    String marca = "";
    static String modelo = "";
    static int bateria = 100;
    static boolean ligado = false;
    Scanner scanner = new Scanner(System.in);


     public void main_menu(){
        System.out.println("Bem vindo ao " + celular.modelo + "!");
        System.out.println("Pressione 1 para iniciar o sistema.");
        int choice_menu = scanner.nextInt();
        if(choice_menu == 1){
            ligar();
        }else{
            System.out.println("ERRO!");
            System.exit(0);
        }
    }

    public void ligar(){
            if (ligado == false){
                System.out.println("Inicializando o sistema...");
                usar(0);
            }else{
                System.out.println("O sistema já está inicializado.");
            }
        }

    public void usar(int consumo){
        if(bateria - consumo >= 0){
            bateria -= consumo;
            System.out.println("bateria " + bateria + "%");
        }
    }

    public static void jogar(int bateria){
        Scanner scanner = new Scanner(System.in);

        while(bateria > 0){
            System.out.println("Deseja jogar ou mexer no instagram?");
            System.out.println("1 - Jogar \n2 - Instagram");
            int choice_game = scanner.nextInt();

            if(choice_game == 1){
                bateria -= 10;
            }else{
                bateria -= 40;
            }
            System.out.println("bateria " + bateria + "%");
        }
        scanner.close();
    }

}


