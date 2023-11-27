package VotacaoEscolar;

public class Aluno extends Pessoa {

    private int matricula;
     private boolean voto;

    public Aluno(String nome, char sexo, int matricula) {
        super(nome, sexo);
        this.voto = false;
        this.matricula = matricula;
    }


    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public boolean isVoto() {
        return voto;
    }

    public void setVoto(boolean voto) {
        this.voto = voto;
    }

    @Override
    public void votar() {
        if (voto){
            System.out.println("O aluno ja votou");
        }else {
            setVoto(true);
        }
    }
}
