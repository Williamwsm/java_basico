package BibliotecaVirtual;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Livro> disponiveis;
    private ArrayList<Livro> livrosEmprestados;

    public Biblioteca() {
        this.disponiveis = new ArrayList<>();
        this.livrosEmprestados = new ArrayList<>();
    }
    public void novoLivro(Livro livro){
        disponiveis.add(livro);
    }

    public void emprestarLivro(Usuario usuario, Livro livro) throws Exception{
        if (livro.getStatus() == true ){
                disponiveis.remove(livro);
                livro.setStatus(false);
                livrosEmprestados.add(livro);
                usuario.emprestados(livro);
        } else if (usuario.getLivrosEmprestados().contains(livro)) {
            throw new RuntimeException("voce ja possui esse livro");

        } else {
            throw new RuntimeException("esse livro ja foi emprestado, tente novamente em outro dia");
        }
    }

    public void devolverLivro(Usuario usuario,Livro livro) throws Exception{
        if (livro.getStatus() ==true ){
                throw new RuntimeException("esse livro ja foi devolvido");
        } else if (!usuario.getLivrosEmprestados().contains(livro)) {
            throw new RuntimeException("Voce nao possue esse livro");
        } else{
                livrosEmprestados.remove(livro);
                livro.setStatus(true);
                usuario.devolver(livro);
                disponiveis.add(livro);
        }

    }

    public String buscarLivroPorTituto(String titilo){
        String ld = "";
        boolean encontrado = false;
        for (Livro l: disponiveis){

           if (l.getTitulo().toLowerCase().contains(titilo.toLowerCase() )){
                ld += "["+l.getTitulo()+"] ";
                encontrado = true;
            }

        }
        if (encontrado == false){
            throw new RuntimeException("esse livro nao foi encontrado");
        }

        return ld;
    }

    public String mostrarLivrosDisponiveis() {
        String ld = "";
        for (Livro l : disponiveis) {
        ld += "["+l.getTitulo()+"] ";

    }
        return ld;
    }

}

