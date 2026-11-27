package secao2;
import java.util.Scanner;

public class calculadora_mmc {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor digite seu peso em kg: ");
        Double kg = scanner.nextDouble();

        System.out.println("Por favor digite sua altura em m: ");
        Double height = scanner.nextDouble();

        Double peso = kg / (height * height);

        if (peso < 18.5){
            System.out.println("IMC: " + peso + " Abaixo do peso.");
        }else if (peso >= 18.5 && peso <= 24.9){
            System.out.println("IMC: " + peso + "Peso Normal.");
        }else if(peso >= 25 && peso < 29.9){
            System.out.println("IMC: " + peso + "Sobrepeso.");
        }else{
            System.out.println("Obesidade... procure um profissional da saúde.");
        }
        scanner.close();

    }
    
}
