package VotacaoEscolar;

import java.util.ArrayList;
import java.util.Scanner;

public class Turmas {
    Votacao votacao = new Votacao();
    private ArrayList<Pessoa> turma;

    private Chapas[] chapa;

    public Turmas() { // listas dos alunos e professores de cada turma
        this.turma = new ArrayList<>();
        this.chapa =  new Chapas[2];
    }

    public ArrayList<Pessoa> getTurma() {
        return turma;
    }

    public void setTurma(ArrayList<Pessoa> turma) {
        this.turma = turma;
    }


    public Chapas[] getChapa() {
        return chapa;
    }

    public void setChapa(Chapas[] chapa) {
        this.chapa = chapa;
    }
    public void addChapas(Chapas chapas) {
        if (votacao.votacaoAberta == true) {
            System.out.println("Nao é possivel mais cadastrar chapas \n");

        } else {
            for (int x = 0; x < chapa.length; x++) {
                if (chapa[x] == null) {
                    chapa[x] = chapas;
                    break;
                }
            }
        }
    }

    public  void mudarChapa(Turmas turmas, Chapas chapas){
        Scanner ler = new Scanner(System.in);
        int opcao;
        if (votacao.votacaoAberta == true) {
            System.out.println("Nao é possivel mais cadastrar chapas \n");

        } else {
            turmas.mostrarChapas();
            System.out.println("Informe o numero da chapa que sera removida");
            opcao = ler.nextInt();
            turmas.chapa[opcao -1] = null;
            turmas.addChapas(chapas);
        }

    }

    public  void mostrarChapas (){
        for (int x = 0; x< chapa.length; x++){
            System.out.println("Chapa: "+ (x+1) );
            System.out.println( chapa[x].getLider().getNome());
            System.out.println( chapa[x].getVice().getNome());
        }
    }

    public  void indetificarChapa (Chapas chapas){
        for (int x = 0; x< chapa.length; x++){
            if(chapas.equals(chapa[x])){
                System.out.println(chapas.getLider().getNome() );
                System.out.println(chapas.getVice().getNome());
            }
        }
    }

   

}
