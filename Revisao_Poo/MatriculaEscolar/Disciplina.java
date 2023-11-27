package MatriculaEscolar;

public class Disciplina {
    private int i = 0;
    private int codigo;
    private String nome;
    private  String horario;
    private Aluno[] listaAlunos;
    private Aluno[] aprovados;

    public Disciplina(int codigo, String nome, String horario, int totalAlunos) {
        this.codigo = codigo;
        this.nome = nome;
        this.horario = horario;
        this.listaAlunos = new Aluno[totalAlunos];

    }

    public boolean matricularAluno(Aluno aluno) throws Exception {
        boolean valido = false;
        if (i > listaAlunos.length-1) {
            throw new RuntimeException("a discipla ja esta cheia");
        }else {
            for (Aluno a : listaAlunos) {
                if (aluno.equals(a)) {
                    throw new RuntimeException("O aluno ja estar matriculado nessa disciplina");
                }
                if (a == null) {
                    valido = true;

                }
            }
            if (valido == true) {
                for (int x = 0; x< listaAlunos.length; x++ ) {
                    if (listaAlunos[x] == null) {
                        aluno.setStatus('A');
                        listaAlunos[x] = aluno;
                        i++;
                        break;
                    }
                }
            }
            return true;
            // um aluno nao pode se matricular mais de uma vez na mesma diciplina
        }
    }

    public boolean desmatricularAluno(int matricula) {
        boolean validacao = false;
        for (int x =0; x < listaAlunos.length;x++) {
            if (listaAlunos[x] != null && listaAlunos[x].getNrMatricula() == matricula) {
                validacao = true;
                listaAlunos[x] = null;
                i--;
                break;
            }
        }
        if (validacao == false) {
            return false;
        }
        // o aluno devera ser retirado do vetor caso a maticula informada por parametro nao exista devera ser retornado um false
        return true;
    }

    public float mediaDaTurma(){
        float media =0;
        int cont = 0;
        for (Aluno a :listaAlunos) {
            if ( a != null &&a.getStatus() == 'A'){
                media+= a.getMedia();
                cont++;
            }
        }
        media = media/cont;

        return media;
        //retorna a media da turma, os alunos trancados nao deverao contabilizados
    }

    public boolean  trancarMatricula(int nrMatricula) throws  Exception{
        boolean validacao = false;
        for (Aluno a :listaAlunos) {
            if (a != null && a.getNrMatricula() == nrMatricula){
                a.setStatus('T');
                validacao  = true;
            }
        }
        if (validacao != true){
            throw new RuntimeException("voce nao estar matriculado");
        }
        return true;
        // o status do aluno devera passar de A pra T
    }


    public Aluno[] alunosAprovados(){
         aprovados = new Aluno[i];
        for (int x = 0; x< listaAlunos.length; x++) {
            if ( listaAlunos[x] != null && listaAlunos[x].getMedia()>= 6){
               aprovados[x] = listaAlunos[x];
            }

        }
        return aprovados;
        // mostra todos os alunos que estao aprovados na disciplina, para passar a media é 6
    }

    public Aluno maiorMedia(){
        Aluno maior = listaAlunos[0];
        for(int a =0; a < listaAlunos.length;a++ ) {
            if (listaAlunos[a] != null && maior.getMedia() < listaAlunos[a].getMedia() ){
                maior = listaAlunos[a];

            }
        }
        return maior;
        //mostra o aluno que teve a maior media
    }

}