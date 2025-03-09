package lista1;

import java.util.Scanner;

public class Exercicio2 {

    int[] vetorA = new int[10];
    int[] ParImpar = new int[2];

    public void lerNumeros() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um numero: ");
            int numero = sc.nextInt();
            vetorA[i] = numero;
            if (numero % 2 == 0) ParImpar[0]++;
            else ParImpar[1]++;
        }
    }

    public void imprimirParImpar() {
        System.out.println("Números pares:" + ParImpar[0]);
        System.out.println("Números ímpares:" + ParImpar[1]);
    }

    public static void main(String[] args) {
        Exercicio2 obj = new Exercicio2();
        obj.lerNumeros();
        obj.imprimirParImpar();
    }
}
