package lista1;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio3 {

    private ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();

    public class Funcionario {
        private final String nome;
        private final String sexo;
        private final String dataNascimento;
        Funcionario(String nome, String sexo, String dataNascimento) {
            this.nome = nome;
            this.sexo = sexo;
            this.dataNascimento = dataNascimento;
        }
        public String getDataNascimento() { return dataNascimento; }
        public int getIdade() {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate dataNasc = LocalDate.parse(dataNascimento, formatter);
            LocalDate hoje = LocalDate.now();
            return Period.between(dataNasc, hoje).getYears();
        }
        public String getNome() { return nome; }
        public String getSexo() { return sexo; }
    }

    public void lerFuncionarios() {
        Scanner scanner = new Scanner(System.in);
        String retorno = "";
        do {
            System.out.println("Digite o nome do funcionario " + (funcionarios.size() + 1));
            String nome  = scanner.nextLine();
            System.out.println("Especifique o sexo do funcionario " + (funcionarios.size() + 1) + " [masculino/feminino]");
            String sexo = scanner.nextLine().toLowerCase();
            System.out.println("Digite a data de nascimento do funcionario " + (funcionarios.size() + 1) + " [DD/MM/YYYY]");
            String dataNascimento = scanner.nextLine();
            Funcionario funcionariotemporario = new Funcionario(nome, sexo, dataNascimento);
            funcionarios.add(funcionariotemporario);
            if (this.funcionarios.size() >= 10) {
                System.out.println("Caso deseja parar de adicionar funcionários, digite FINALIZAR, se não, digite ADICIONAR:");
                retorno = scanner.nextLine();
            }
        } while (!retorno.equalsIgnoreCase("finalizar"));
    }

    public void imprimirRelatorioFuncionarios() {
        System.out.println("---------------RELATÓRIO DOS FUNCIONÁRIOS---------------");
        for (Funcionario funcionario : funcionarios) {
            System.out.println("Nome: " + funcionario.getNome());
            System.out.println("Sexo: " + funcionario.getSexo());
            System.out.println("Data de nascimento: " + funcionario.getDataNascimento());
            System.out.println("Idade: " + funcionario.getIdade());
            System.out.println("-----------------");
        }
    }

    public int quantidadeFuncionarios(String sexo) {
        return funcionarios.stream().filter(funcionario -> funcionario.getSexo().equalsIgnoreCase(sexo)).toList().size();
    }

    public float getIdadeMedia(String tipo) {
        if (tipo == "masculino" || tipo == "feminino") {
            return (float) funcionarios.stream()
                    .filter(funcionario -> funcionario.getSexo().equalsIgnoreCase(tipo))
                    .mapToInt(Funcionario::getIdade)
                    .average()
                    .orElse(0.0);
        }
        return (float) funcionarios.stream()
                .mapToInt(Funcionario::getIdade)
                .average()
                .orElse(0.0);
    }

    public void imprimirEstatisticasFuncionarios() {
        int quantidadeTotalFuncionarios = funcionarios.size();
        int quantidadeMasculino = quantidadeFuncionarios("masculino");
        float percentualMasculino = ((float) quantidadeFuncionarios("masculino") / quantidadeTotalFuncionarios) * 100;
        int quantidadeFeminino = quantidadeFuncionarios("feminino");
        float percentualFeminino = ((float) quantidadeFuncionarios("feminino") / quantidadeTotalFuncionarios) * 100;
        float idadeMediaTotal = getIdadeMedia("total");
        float idadeMediaMasculino = getIdadeMedia("masculino");
        float idadeMediaFeminino = getIdadeMedia("feminino");
        System.out.println("Quantidade total: " + quantidadeTotalFuncionarios);
        System.out.println("Quantidade de funcionários masculinos: " + quantidadeMasculino + " (" +  percentualMasculino + "%)");
        System.out.println("Quantidade de funcionárias femininas: " + quantidadeFeminino + " (" +  percentualFeminino + "%)");
        System.out.println("Idade média total: " + idadeMediaTotal);
        System.out.println("Idade média do sexo masculino: " + idadeMediaMasculino);
        System.out.println("Idade média do sexo feminino: " + idadeMediaFeminino);

    }

    public static void main(String[] args) {
        Exercicio3 obj = new Exercicio3();
        obj.lerFuncionarios();
        obj.imprimirRelatorioFuncionarios();
        obj.imprimirEstatisticasFuncionarios();
    }
}

