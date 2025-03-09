package lista1;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio6 {

    public void lerConjuntos() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma quantidade de conjuntos: ");
        int quantidadeconjuntos = sc.nextInt();

        for (int i = 1; i <= quantidadeconjuntos; i++) {
            System.out.println("Conjunto n" + i + ":");
            System.out.print("Digite o primeiro número: ");
            int num1 = sc.nextInt();
            System.out.print("Digite o segundo número: ");
            int num2 = sc.nextInt();
            System.out.print("Digite o terceiro número: ");
            int num3 = sc.nextInt();

            ordenar(num1, num2, num3);
        }
    }

    public void ordenar(int a, int b, int c) {
        int[] numeros = {a, b, c};
        Arrays.sort(numeros);
        System.out.println("Ordem crescente: " + numeros[0] + " " + numeros[1] + " " + numeros[2]);
    }

    public static void main(String[] args) {
        Exercicio6 obj = new Exercicio6();
        obj.lerConjuntos();
    }

}
