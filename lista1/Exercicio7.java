package lista1;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio7 {

    public static int[] somarEInverter(int[] vetorA, int[] vetorB) {
        int N = vetorA.length;
        int[] resultado = new int[N];

        for (int i = 0; i < N; i++) {
            resultado[i] = vetorA[i] + vetorB[i];
        }

        for (int i = 0; i < N / 2; i++) {
            int temp = resultado[i];
            resultado[i] = resultado[N - 1 - i];
            resultado[N - 1 - i] = temp;
        }

        return resultado;
    }

    public void lerVetores() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tamanho dos vetores: ");
        int N = sc.nextInt();

        int[] vetorA = new int[N];
        int[] vetorB = new int[N];

        System.out.println("Digite os elementos do Vetor A:");
        for (int i = 0; i < N; i++) {
            vetorA[i] = sc.nextInt();
        }

        System.out.println("Digite os elementos do Vetor B:");
        for (int i = 0; i < N; i++) {
            vetorB[i] = sc.nextInt();
        }

        int[] resultado = somarEInverter(vetorA, vetorB);

        System.out.println("Vetor Resultado:");
        System.out.println(Arrays.toString(resultado));

    }

    public static void main(String[] args) {
        Exercicio7 obj = new Exercicio7();
        obj.lerVetores();
    }

}
