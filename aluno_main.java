package secao6;

public class aluno_main {
    public static void main(String[] args) {
        aluno melissa = new aluno("Melissa",123,  10.0);

        System.out.println(melissa.getNome());

        System.out.println(melissa.getNotaFinal());

        melissa.exibirInfo();
    }
}
