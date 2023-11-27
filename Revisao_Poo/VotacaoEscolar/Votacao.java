package VotacaoEscolar;

import java.util.Scanner;

public class Votacao {
     boolean votacaoAberta = false;

    public void InicarVotacao(){
        if (votacaoAberta == true) {
            System.out.println("A votacao ja foi iniciada");
        }else {
            votacaoAberta = true;
            System.out.println("A votacao esta sendo inciada");
        }
    }

    public void EncerrarVotacao(){
        if (votacaoAberta == false) {
            System.out.println("A votacao naoi iniciada");
        }else {
            votacaoAberta = false;
            System.out.println("A votacao esta sendo encerrada ");
        }
    }

    public  void votar(Aluno aluno,Chapas chapas){
        boolean valido = false;
        aluno.votar();
        chapas.addVoto();

    }

    public void votar(int idTurma, Professor professor, Chapas chapas, Turmas turmas){
        professor.votar(idTurma, turmas);
        chapas.addVoto();
    }

    public void emitirResultado(Turmas turmas){
         if (votacaoAberta == true){
             System.out.println("A votacao ainda nao acabou");
         }else {
             for (int x = 0; x< turmas.getChapa().length; x++){
                 System.out.println(turmas.getChapa()[x].getLider() +"\t"+ turmas.getChapa()[x].getVice() +"\t"+ turmas.getChapa()[x].getVotos()+"\n\n");
             }
         }


    }





}
