package VotacaoEscolar;

import java.util.ArrayList;

public class Professor extends Pessoa{
    private  int cod;
    private ArrayList<Turmas> aulas;
    private ArrayList<Integer> idTurmasVotadas;

    public Professor(String nome, char sexo, int cod) {
        super(nome, sexo);
        this.cod = cod;
        this.idTurmasVotadas = new ArrayList<>();
        this.aulas = new ArrayList<>();
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public ArrayList<Turmas> getAulas() {
        return aulas;
    }

    public void setAulas(Turmas turmas) {
        this.aulas.add(turmas);
    }

    @Override
    public void votar() {

    }
     public void votar(int idTurma, Turmas turmas){
        boolean validacao = false;
         for (Turmas t: aulas) {
             if (t.equals(turmas)){
                 validacao = true;
                 break;
             }
         }
         if (validacao == false){
             throw new RuntimeException("Voce nao esta nesta turma");
         }
         if (idTurmasVotadas.size()>0){
             for (Integer v: idTurmasVotadas ) {
                 if (v == idTurma ) {
                     System.out.println(" vcoce ja votou nesta turma");
                     break;
                 } else {
                     idTurmasVotadas.add(idTurma);
                     break;
                 }
             }

         }else {
             idTurmasVotadas.add(idTurma);
         }


     }
}
