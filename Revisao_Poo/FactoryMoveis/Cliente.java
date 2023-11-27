package FactoryMoveis;

import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Menu menu = new Menu();
        MovelFactory fabricaModerna = new FabricaModerna();
        MovelFactory fabricaVitoriana = new FabricaVitoriana();
        MovelFactory fabricaArtDeco = new FabricaArtDeco();

        int opcao;
        int opcao1;
        while (true){

            System.out.println("Seja bem vindo a MB a sua loja de moveis\n" +
                    "qual o móvel que voce esta procurando?\n" +
                    "1- Cadeira\n" +
                    "2- Sofa\n" +
                    "3- Mesa de centro \n" +
                    "4- para sair");
            opcao = ler.nextInt();
            if (opcao == 4){
                ler.close();
                break;
            }
            switch (opcao){
                case 1:
                    System.out.println(menu.menu());
                    opcao1 = ler.nextInt();
                    switch (opcao1){
                        case 1:
                            Movel cadeiraModerna = fabricaModerna.createMovel("Cadeira");
                            System.out.println(cadeiraModerna.descricao());
                            break;
                        case 2:
                            Movel cadeiraVitoriana = fabricaVitoriana.createMovel("Cadeira");
                            System.out.println(cadeiraVitoriana.descricao());
                            break;
                        case 3:
                            Movel cadeiraArtDeco = fabricaArtDeco.createMovel("Cadeira");
                            System.out.println(cadeiraArtDeco.descricao());
                            break;
                        default:
                            throw new IllegalArgumentException("opcao invalida");
                    }
                    break;
                case 2:
                    System.out.println(menu.menu());
                    opcao1 = ler.nextInt();
                    switch (opcao1) {
                        case 1:
                            Movel sofaModerna = fabricaModerna.createMovel("Sofa");
                            System.out.println(sofaModerna.descricao());
                            break;
                        case 2:
                            Movel sofaVitoriana = fabricaVitoriana.createMovel("Sofa");
                            System.out.println(sofaVitoriana.descricao());
                            break;
                        case 3:
                            Movel sofaArtDeco = fabricaArtDeco.createMovel("Sofa");
                            System.out.println(sofaArtDeco.descricao());
                            break;
                        default:
                            throw new IllegalArgumentException("opcao invalida");
                    }
                    break;
                case 3:
                    System.out.println(menu.menu());
                    opcao1 = ler.nextInt();
                    switch (opcao1) {
                        case 1:
                            Movel mesaDeCentroModerna = fabricaModerna.createMovel("MesaDeCentro");
                            System.out.println(mesaDeCentroModerna.descricao());
                            break;
                        case 2:
                            Movel mesaDeCentroVitoriana = fabricaVitoriana.createMovel("MesaDeCentro");
                            System.out.println(mesaDeCentroVitoriana.descricao());
                            break;
                        case 3:
                            Movel mesaDeCentroArtDeco = fabricaArtDeco.createMovel("MesaDeCentro");
                            System.out.println(mesaDeCentroArtDeco.descricao());
                            break;
                        default:
                            throw new IllegalArgumentException("opcao invalida");
                    }
                    break;
                default:
                    throw new IllegalArgumentException("opcao invalida");

            }



        }
    }
        }
