package Books;

import javax.swing.JOptionPane;

public class Cadastro {

	public static void main(String[] args) {
		while (true){
			String nomeLivro = JOptionPane.showInputDialog("Digite O titulo do livro");
			String nomeDoAutor = JOptionPane.showInputDialog("");
			String anoDePublic = JOptionPane.showInputDialog("");
			String[] valores = {"AVENTURA", "fANTASIA", "FIC��O", "ROMANCE","TERROR"};
			String seletor = (String) JOptionPane.showInputDialog(null,"Escolha um g�nero liter�rio","O tipo de g�nero",JOptionPane.QUESTION_MESSAGE,null,valores,valores[0]);
			Livros obecLivro = new Livros(nomeLivro, nomeDoAutor, anoDePublic, seletor);
			int escolha = JOptionPane.showConfirmDialog(null,"Deseja adicionar mais um livros?");
			 if(escolha == 1) {
				 break;
			 }
			
			
		}
		System.out.println(Acervo.listar());
		int buscar = JOptionPane.showConfirmDialog(null,"Buscar livro por genero?");
		if(buscar == 0) {
			String[] valores2 = {"AVENTURA","FANTASIA","FIC��O","ROMANCE","TERROR"};
			String seletor2 = (String) JOptionPane.showInputDialog(null,"Escolha um g�nero liter�rio","O tipo de g�nero",JOptionPane.QUESTION_MESSAGE,null,valores2,valores2[0]);
			Acervo quant = new Acervo();
			System.out.println("Quantidade de livros encontrados por genero"+ seletor2+ "="+ quant.buscar(seletor2));
		}

	}

}
