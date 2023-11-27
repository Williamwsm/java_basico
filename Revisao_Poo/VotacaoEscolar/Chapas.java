package VotacaoEscolar;

public class Chapas {
    private Aluno lider;
    private Aluno vice;
    private int votos;

    public Chapas(Aluno lider, Aluno vice) {
        this.lider = lider;
        this.vice = vice;
        this.votos = 0;
    }

    public int getVotos() {
        return votos;
    }

    public Aluno getLider() {
        return lider;
    }

    public void setLider(Aluno lider) {
        this.lider = lider;
    }

    public Aluno getVice() {
        return vice;
    }

    public void setVice(Aluno vice) {
        this.vice = vice;
    }

    public void addVoto(){
        votos++;
    }
}

