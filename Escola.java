import java.util.Scanner;

public class Escola {
    private String nomeEscola;
    private Turma[] turmas;
    private static int totalTurmas = 0;

    public Escola(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome da escola: ");
        this.nomeEscola = scanner.nextLine();

        System.out.println("Digite o número de turmas que a escola possui: ");
        int qtd_turmas = scanner.nextInt();
        turmas = new Turma[qtd_turmas];
    }

    public void adicionarTurmas(){
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < turmas.length; i++){
            System.out.println("\n--- CADASTRO DA TURMA" + (i + 1) + " ---");

            turmas[i] = new Turma();
            turmas[i].adicionarAlunos();
            totalTurmas++;
        }
    }

    public void exibirRelatorio(){
        System.out.println("Relatório geral da escola " + nomeEscola);

        for(int i = 0; i < totalTurmas; i++)
            turmas[i].listarAlunos();

        Turma.exibirTotalAlunos();
    }
}

