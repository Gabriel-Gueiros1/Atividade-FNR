public class Aluno {

    private String nome;
    private int matricula;

    Aluno(String nome, int matricula){
        setMatricula(matricula);
        setNome(nome);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public int getMatricula() {
        return matricula;
    }

}