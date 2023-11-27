package BibliotecaVirtual;

import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        int opcao;
        Biblioteca biblioteca = new Biblioteca();
        Usuario usuario = new Usuario("Rita", 276);
        Usuario usuario1 = new Usuario("malu", 323);

        Livro livro =  new Livro("Montando seu esquema de piramides ", "Nilton Cesar" ,2023);
        Livro livro1 =  new Livro("A vaqueira por tras dos codigos", "Luana Barreto",2019);
        Livro livro2 =  new Livro("adversidades constantes ", "Flaynner",2022);
        Livro livro3 =  new Livro("Do pao ao mucillon, uma triste historia de amor" , "Kaylaine Assuncao",2025);
        biblioteca.novoLivro(livro);
        biblioteca.novoLivro(livro1);
        biblioteca.novoLivro(livro2);
        biblioteca.novoLivro(livro3);



        while (true) {
            System.out.println("--------------MENU-------------\n\n");
            System.out.println("Escolha a operacao desejada " +
                    "\n1- ver a lista de livros disponiveis " +
                    "\n2- pegar um livro emprestado " +
                    "\n3- devolver livro " +
                    "\n4- buscar livro desejado " +
                    "\n5- sair do menu ");
            opcao = ler.nextInt();
            if (opcao ==5){
                ler.close();
                break;
            }

            switch (opcao) {
                case 1:
                    System.out.println(biblioteca.mostrarLivrosDisponiveis());
                    break;
                case 2:
                    System.out.println("Informe o seu usuario:");
                    System.out.println("Informe o livro que voce deseja:");

                    biblioteca.emprestarLivro(usuario,livro3 );
                    break;
                case 3: biblioteca.devolverLivro(usuario, livro3);
                    break;
                case 4:
                    String titulo="";
                    System.out.println("informe o titulo que voce procura");
                    titulo = ler.next();
                    System.out.println(biblioteca.buscarLivroPorTituto(titulo));

                    break;
                    default:
                    System.out.println("opcao invalida!");
            }
        }
    }
}
