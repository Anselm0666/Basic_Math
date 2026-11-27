package secao6;

public class produto {
    String nome;
    private Double preco;
    int garantia;

    public produto(String nome, double preco, int garantia){
        this.nome = nome;
        this.preco = preco;
        this.garantia = garantia;
    }


    public void call_desconto(double porcentagem){
        if(porcentagem > 0 && porcentagem <= 100){

            double valor_desconto = calcular_desconto(porcentagem);
            preco -= valor_desconto;

            System.out.println("Desconto aplicado, o preco agora é: " + preco);

        }else{
            System.out.println("Porcentagem incorreta.");
        }

    }

    public double calcular_desconto(double porcentagem){
        return (preco * porcentagem) / 100;

    }
    
}
