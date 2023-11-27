package BibliotecaVirtual;

import java.util.ArrayList;

public class Usuario {
    private String nome;
    private int numIndicacao;
     private ArrayList<Livro> livrosEmprestados;

    public Usuario(String nome, int numIndicacao) {
        this.nome = nome;
        this.numIndicacao = numIndicacao;
        this.livrosEmprestados = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumIndicacao() {
        return numIndicacao;
    }

    public void setNumIndicacao(int numIndicacao) {
        this.numIndicacao = numIndicacao;
    }

    public ArrayList<Livro> getLivrosEmprestados() {
        return livrosEmprestados;
    }

    public void emprestados(Livro l) {
        livrosEmprestados.add(l);
    }
    public void devolver(Livro l){
        livrosEmprestados.remove(l);
    }
}
