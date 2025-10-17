package github1;

import java.util.Scanner;

public class Turma {
    private String nomeTurma;
    private String professor;
    private Aluno[] alunos;
    private static int totalAlunos = 0;

    public Turma(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome da turma: ");
        this.nomeTurma = scanner.nextLine();

        System.out.println("Digite o nome do(a) professor(a): ");
        this.professor = scanner.nextLine();

        System.out.println("Digite o número de alunos que a turma possui: ");
        int qtd_alunos = scanner.nextInt();
        alunos = new Aluno[qtd_alunos];
    }

    public void adicionarAlunos(){
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < alunos.length; i++) {
            System.out.println("\n--- CADASTRO DO ALUNO " + (i + 1) + " ---");

            System.out.println("Nome: ");
            String nome = scanner.nextLine();

            System.out.println("Matrícula: ");
            int matricula = scanner.nextInt();

            System.out.println("Primeira nota: ");
            float nota1 = scanner.nextFloat();

            System.out.println("Primeira nota: ");
            float nota2 = scanner.nextFloat();

            alunos[i] = new Aluno(nome, matricula, nota1, nota2);
            totalAlunos++;
        }
    }

    public double calcularMediaTurma(){
        double soma = 0;
        for(int i = 0; i < totalAlunos; i++){
            soma += alunos[i].getMedia();
        }
        return soma/totalAlunos;
    }

    public void listarAlunos(){
        System.out.println("\nTurma: " + getNomeTurma() + " (" + getProfessor() + ")");
        System.out.println("Alunos cadastrados:\n");

        for(int i = 0; i < totalAlunos; i++)
            alunos[i].exibirInfo();

        System.out.println("\nMédia geral da turma é de: " + calcularMediaTurma());
    }

    public static void exibirTotalAlunos(){
        System.out.println("\ntotal de alunos da escola: " + totalAlunos);
    }

    public String getNomeTurma(){
        return nomeTurma;
    }

    public String getProfessor(){
        return professor;
    }
}
