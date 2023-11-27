package Books;
import java.util.ArrayList;

public class Acervo {
	private static ArrayList<Livros> estante = new ArrayList<>();
	
	public static ArrayList<Livros> getEstante(){
		return estante;
	}
	
	public static void adicionar(Livros L){
		estante.add(L);
	}
	
	public static String listar() {
		String saida = "";
		int cont = 1;
		for (Livros L: estante) {
			saida += "\n---------------------Livro cadastrado"+ (cont ++) +"--------------------"+"\n";
			saida += L.toString();
		}
		 return saida;
	}
	public int buscar(String genero){
		int contLivro = 0;
		for(Livros L: estante) {
			if(L.getGeneroLiteral().equalsIgnoreCase(genero)) {
				System.out.println("=============LIVRO ENCONTRADO ========="+"\n" + L);
				contLivro ++;
			}
		}
		return contLivro;
	}
}
