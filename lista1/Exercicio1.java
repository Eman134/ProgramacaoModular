package lista1;

import java.util.Scanner;

public class Exercicio1 {
    private int[] vetorA = new int[15];
    private int[] vetorB = new int[15];

    public void lerVetorA() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 15; i++) {
            System.out.println("Digite um valor: ");
            int numero = sc.nextInt();
            this.vetorA[i] = numero;
        }
    }

    public int fatorial(int numero) {
        if (numero == 1) return 1;
        else return fatorial(numero - 1) * numero;
    }

    public void construirVetorB() {
        for (int i = 0; i < 15; i++) {
            int numero = vetorA[i];
            this.vetorB[i] = fatorial(numero);
        }
    }

    public void imprimirNumeros() {
        for (int i = 0; i < 15; i++) {
            System.out.print(this.vetorB[i] + " ");
        }
    }

    public static void main(String[] args) {
        Exercicio1 obj = new Exercicio1();
        obj.lerVetorA();
        obj.construirVetorB();
        obj.imprimirNumeros();
    }

}
