package secao6;

public class aluno {
    
    private String nome;
    //private int matricula;
    private double nota_final;

    public aluno(String nome, int matricula, double nota_final){
        this.nome = nome;
        //this.matricula = matricula;
        this.nota_final = nota_final;
    } 

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        if(nome != null && !nome.isEmpty()){
            this.nome = nome;
        }else{
            System.out.println("Nome inválido.");
        }
    }

    public double getNotaFinal(){
        return nota_final;
    }

    public void setNotaFinal(double nota_final){
        if(nota_final >= 0 && nota_final <= 100){
            this.nota_final = nota_final;
        }else{
            System.out.println("Nota inválida.");
        }
    }

    public void exibirInfo(){
        System.out.println("O aluno " + nome + " obteve a nota final de: " + nota_final);
    }
}
