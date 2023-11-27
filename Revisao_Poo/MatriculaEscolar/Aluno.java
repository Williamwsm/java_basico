package MatriculaEscolar;

public class Aluno {
    private int nrMatricula;
    private String nome;
    private char status;
    private float media;

    public Aluno(int nrMatricula, String nome, float media) {
        this.nrMatricula = nrMatricula;
        this.nome = nome;
        this.media = media;
    }

    public int getNrMatricula() {
        return nrMatricula;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public float getMedia() {
        return media;
    }

    @Override
    public String toString() {
        return "Aluno: " +  " numero da matricula: " + nrMatricula +
                " \nnome: " + nome + " \nstatus: " + status + "\nmedia: " + media ;
    }
}

