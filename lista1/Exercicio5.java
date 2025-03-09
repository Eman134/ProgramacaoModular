package lista1;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio5 {

    public void coletarDados() {
        Scanner sc = new Scanner(System.in);

        String retorno = "";

        ArrayList<Float> salarios = new ArrayList<Float>();

        do {
            float salario = 0;
            int familia = 0;
            System.out.println("Digite o salário familiar: ");
            salario = sc.nextFloat();
            System.out.println("Digite a quantidade de pessoas na família: ");
            familia = sc.nextInt();
            sc.nextLine();
            salarios.add(salario/familia);
            System.out.println("Digite S para continuar ou N para parar:");
            retorno = sc.nextLine();
        } while (!retorno.equalsIgnoreCase("N"));

        float mediaSalarios = (float) salarios.stream()
                .mapToDouble(Float::doubleValue)
                .average()
                .orElse(0.0);

        System.out.println("Média dos salários per capita: " + mediaSalarios);
    }

    public static void main(String[] args) {
        Exercicio5 obj = new Exercicio5();
        obj.coletarDados();
    }

}
