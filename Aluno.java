package github1;

public class Aluno {
    private String nome;
    private int matricula;
    private float nota1, nota2;

    public Aluno(String nome, int matricula, float nota1, float nota2){
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public float calcularMedia(){
        return (nota1 + nota2) / 2;
    }

    public void exibirInfo(){
        System.out.println("aluno: " + getNome() +
                " | matricula: " + getMatricula() +
                " | media: " + getMedia());
    }

    public String getNome(){
        return nome;
    }

    public int getMatricula(){
        return matricula;
    }

    public float getMedia(){
        return calcularMedia();
    }
}