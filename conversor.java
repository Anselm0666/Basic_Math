package secao3;
import java.util.Scanner;

public class conversor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite aqui a temperatura que será convertida:");
        Double temp = scanner.nextDouble();


        System.out.println("Esta temperatura está em Celsius ou Fahrenheit?" + "\n" +
        "1 - Celsius" + "\n" + "2 - Fahrenheit");
        int awnser = scanner.nextInt();

        if(awnser == 1){
            c_to_f(temp);
        }else{
            f_to_c(temp);
        }

        scanner.close();
    }

    public static void c_to_f(Double temp){
        Double faren = temp * 1.8 + 32;

        System.out.println(temp + "Cº é equivalente a " + faren + "Fº");
    }

    public static void f_to_c(Double temp){
        Double cels = (temp - 32) / 1.8; 
        System.out.println(temp + "Fº é equivalente a " + cels + "Cº");
    }
    
}
