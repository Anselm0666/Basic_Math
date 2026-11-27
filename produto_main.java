package secao6;

public class produto_main {
    public static void main(String[] args) {

        produto geladeira = new produto("Geladeira Brastemp H67", 599.99, 8);

        geladeira.call_desconto(20);
        
    }
}
