package lista1;

import java.util.Scanner;

public class Exercicio4 {

    public float calcularMedia(float nota1, float nota2, float nota3, char tipo) {
        return switch (tipo) {
            case 'A' -> (nota1 + nota2 + nota3) / 3;
            case 'P' -> (nota1 * 5) + (nota2 * 3) + (nota3 * 2) / 10;
            default -> 0;
        };
    }

    public void lerNotas() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de alunos: ");
        int alunos = sc.nextInt();
        for (int i = 0; i < alunos; i++) {
            System.out.println("Digite a nota 1: ");
            float nota1 = sc.nextFloat();
            System.out.println("Digite a nota 2: ");
            float nota2 = sc.nextFloat();
            System.out.println("Digite a nota 3: ");
            float nota3 = sc.nextFloat();
            System.out.println("Digite o tipo de media [A ou P]: ");
            char tipo = sc.next().charAt(0);
            float media = calcularMedia(nota1, nota2, nota3, tipo);
            System.out.println("Média das notas: " + media);
        }
    }

    public static void main(String[] args) {
        Exercicio4 obj = new Exercicio4();
        obj.lerNotas();
    }
}
