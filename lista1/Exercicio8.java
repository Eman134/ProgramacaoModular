package lista1;

public class Exercicio8 {

    private int[][] matriz = new int[4][4];

    Exercicio8(int[][] matriz) {
        this.matriz = matriz;
    }

    public void imprimirMatriz() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void somaQuadradosDiagonalSecundaria() {
        int soma = 0;
        for (int i = 0; i < 4; i++) {
            int elemento = matriz[i][3 - i];
            soma += elemento * elemento;
        }
        System.out.println("Soma dos quadrados da diagonal 2: " + soma);
    }

    public void multiplicarMatriz(int multiplicador) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] *= multiplicador;
            }
        }
    }

    public void inverterLinhaColuna() {
        for (int i = 0; i < 4; i++) {
            int temp = matriz[2][i];
            matriz[2][i] = matriz[i][2];
            matriz[i][2] = temp;
        }
    }

    public static void main(String[] args) {
        int[][] matrizA = new int[4][4];
        matrizA[0][0] = 5;
        matrizA[0][1] = 10;
        matrizA[0][2] = 7;
        matrizA[0][3] = 8;
        matrizA[1][0] = 13;
        matrizA[1][1] = 4;
        matrizA[1][2] = 1;
        matrizA[1][3] = 3;
        matrizA[2][0] = 9;
        matrizA[2][1] = 2;
        matrizA[2][2] = 6;
        matrizA[2][3] = 5;
        matrizA[3][0] = 10;
        matrizA[3][1] = 7;
        matrizA[3][2] = 4;
        matrizA[3][3] = 9;
        Exercicio8 obj = new Exercicio8(matrizA);
        System.out.println("Matriz A:");
        obj.imprimirMatriz();
        System.out.println("Soma dos quadrados da diagonal 2");
        obj.somaQuadradosDiagonalSecundaria();
        System.out.println("Matriz A multiplicada por uma constante: ");
        obj.multiplicarMatriz(2);
        obj.imprimirMatriz();
        System.out.println("Invertendo a coluna 3 com a linha 3: ");
        obj.inverterLinhaColuna();
        obj.imprimirMatriz();
    }

}
