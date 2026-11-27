package secao5;

public class ex2 {
    public static void main(String[] args) {
        int array1[] = {1, 2, 3, 3, 3, 4, 5, 6, 6, 7};
        int freq = array1[0];
        int maxcont = 1;

        for(int i = 0; i < array1.length; i++){
            int cont = 0;

        for(int j = 0; j < array1.length; j++){
                if (array1[j] == array1[i]){
                    cont++;
                }
            }

            if(cont > maxcont){
                maxcont = cont;
                freq = array1[i];
            }
        }

        System.out.println("O mais frequente é: " + freq);

    }
}
