package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        int[] numeros = new int[3];
        int[] numeros1 = {1,2,3,4,5};
        int[] numeros2 = new int[]{1,2,3,4,5};

        for(int i = 1; i < numeros2.length; i++) {
            System.out.println(numeros2[i]);
        }
        System.out.println("---------------------------------");
        for (int vetorNum : numeros) {
            System.out.println(vetorNum);

        }
    }
}
