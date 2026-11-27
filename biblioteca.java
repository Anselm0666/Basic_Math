package secao6;
import java.util.Scanner;


public class biblioteca {
    private String titulo;
    private String autor;
    private Boolean disponivel;

    public void emprestado(boolean disponivel){
        if(disponivel == false){
            System.out.println("Esta obra se encontra indisponível no momento.");
        }
    }
}
