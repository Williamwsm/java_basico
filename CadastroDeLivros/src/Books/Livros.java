package Books;

public class Livros {
	private String titulo;
	private String autor;
	private String anoDePubli;
	private String generoLiteral;
	
	public Livros(String titulo, String autor, String anoDePubli, String generoLiteral) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.anoDePubli = anoDePubli;
		this.generoLiteral = generoLiteral;

	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getAnoDePubli() {
		return anoDePubli;
	}

	public void setAnoDePubli(String anoDePubli) {
		this.anoDePubli = anoDePubli;
	}

	public String getGeneroLiteral() {
		return generoLiteral;
	}

	public void setGeneroLiteral(String generoLiteral) {
		this.generoLiteral = generoLiteral;
	}

	@Override
	public String toString() {
		return "Titulo: " + titulo + "\n Autor: " + autor + "\n Ano De Publicaçao: " + anoDePubli + "\n Genero Literal: "
				+ generoLiteral;
	}
	
	
	
	

}
