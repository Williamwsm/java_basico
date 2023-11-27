package VotacaoEscolar;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Menu menu = new Menu();
        int opcao;
        int opcaoChapas;
        int opcaoTurmas;
        int usuario;
        Turmas turmas = new Turmas();

        Votacao votacao = new Votacao();

        Turmas turmasSextoAno = new Turmas();
        Turmas turmasSetimoAno = new Turmas();
        Turmas turmasOitavoAno = new Turmas();
        Turmas turmasNonoAno = new Turmas();

        Aluno liderSexto1 = new Aluno("Amanda", 'f', 145);
        Aluno viceSexto1 = new Aluno("Pedro", 'm', 545);
        Aluno liderSexto2 = new Aluno("Viviane", 'f', 211);
        Aluno viceSexto2 = new Aluno("Lucas", 'm', 541);
        Aluno liderSetimo = new Aluno("Rayane", 'f', 154);

        Aluno viceSetimo = new Aluno("Ryam", 'm', 682);
        Aluno liderSetimo1 = new Aluno("Cris", 'f', 146);
        Aluno viceSetimo1 = new Aluno("carlos", 'm', 615);

        Aluno liderOitavo = new Aluno("Camile", 'f', 164);
        Aluno viceOitavo = new Aluno("Jorge", 'm', 525);
        Aluno liderOitavo1 = new Aluno("Samara", 'f', 194);
        Aluno viceOitavo1 = new Aluno("roberto", 'm', 543);

        Aluno liderNono = new Aluno("Luana", 'f', 134);
        Aluno viceNono = new Aluno("Luan", 'm', 535);
        Aluno liderNono1 = new Aluno("Nary", 'f', 624);
        Aluno viceNono1  = new Aluno("Michel", 'm', 785);

        Chapas chapaSextoAno = new Chapas(liderSexto1, viceSexto1);
        Chapas chapaSextoAno2 = new Chapas(liderSexto2, viceSexto2);

        Chapas chapaSetimoAno = new Chapas(liderSetimo, viceSetimo);
        Chapas chapaSetimoAno2 = new Chapas(liderSetimo1, viceSetimo1);

        Chapas chapaOitavoAno = new Chapas(liderOitavo, viceOitavo);
        Chapas chapaOitavoAno2 = new Chapas(liderOitavo1, viceOitavo1);

        Chapas chapaNonoAno = new Chapas(liderNono, viceNono);
        Chapas chapaNonoAno2 = new Chapas(liderNono1, viceNono1);

        turmasSextoAno.addChapas(chapaSextoAno);
        turmasSextoAno.addChapas(chapaSextoAno2);

        turmasSetimoAno.addChapas(chapaSetimoAno);
        turmasSetimoAno.addChapas(chapaSetimoAno2);

        turmasOitavoAno.addChapas(chapaOitavoAno);
        turmasOitavoAno.addChapas(chapaOitavoAno2);

        turmasNonoAno.addChapas(chapaNonoAno);
        turmasNonoAno.addChapas(chapaNonoAno2);
        turmasSextoAno.mostrarChapas();
        turmasNonoAno.mostrarChapas();

        Professor professor = new Professor("marcos", 'm', 336);
        professor.setAulas(turmasSextoAno);
        professor.setAulas(turmasOitavoAno);

        Aluno aluno = new Aluno("lorena",'f', 123);

       while (true) {
            System.out.println(menu.menuPrincial());
            opcao = ler.nextInt();
            if (opcao == 6) {
                ler.close();
                break;
            }
            switch (opcao){
                case 1:
                    System.out.println("Informe a turma q deseja adcionar a chapa"); // talvez switch case
                    turmas.mudarChapa(turmasSextoAno, chapaSextoAno);
                    break;
                case 2:
                    votacao.InicarVotacao();
                    break;
                case 3:
                    votacao.EncerrarVotacao();
                    break;
                case 4:
                    System.out.println("Informe seu tipo de usuario: \n" +
                            "1-Aluno\n" +
                            "2-Professor\n");
                    usuario = ler.nextInt();
                    if (usuario == 1) {
                        System.out.println(menu.menuTurmas());
                        opcaoTurmas = ler.nextInt();

                        switch (opcaoTurmas){
                            case 1:
                                turmasSextoAno .mostrarChapas();
                                System.out.println("Agora escolha uma chapa para votar:");
                                opcaoChapas = ler.nextInt();
                                if (opcaoChapas == 1){
                                    turmasSextoAno.votacao.votar(aluno,chapaSextoAno); // nao sei como fazer o usuario informar o objeto
                                } else if ( opcaoChapas == 2) {
                                    turmasSextoAno.votacao.votar(aluno, chapaSextoAno2);
                                }else {
                                    System.out.println("Opcao invalida ");
                                }

                                break;

                            case 2:
                                turmasSetimoAno .mostrarChapas();
                                System.out.println("Agora escolha uma chapa para votar:");
                                opcaoChapas = ler.nextInt();
                                if (opcaoChapas == 1){
                                   turmasSetimoAno.votacao.votar(aluno,chapaSetimoAno);
                                } else if ( opcaoChapas == 2) {
                                    turmasSetimoAno.votacao.votar(aluno, chapaSetimoAno2);
                                }else {
                                    System.out.println("Opcao invalida ");
                                }
                                break;

                            case 3:
                                turmasOitavoAno .mostrarChapas();
                                System.out.println("Agora escolha uma chapa para votar:");
                                opcaoChapas = ler.nextInt();
                                if (opcaoChapas == 1){
                                    turmasOitavoAno.votacao.votar(aluno,chapaOitavoAno);
                                } else if ( opcaoChapas == 2) {
                                    turmasOitavoAno.votacao.votar(aluno,chapaOitavoAno);
                                }else {
                                    System.out.println("Opcao invalida ");
                                }
                                break;

                            case 4:
                                turmasNonoAno.mostrarChapas();
                                System.out.println("Agora escolha uma chapa para votar:");
                                opcaoChapas = ler.nextInt();
                                if (opcaoChapas == 1){
                                    turmasNonoAno.votacao.votar(aluno,chapaNonoAno);
                                } else if ( opcaoChapas == 2) {
                                    turmasNonoAno.votacao.votar(aluno,chapaNonoAno2);
                                }else {
                                    System.out.println("Opcao invalida ");
                                }
                                break;
                            default:
                                System.out.println("\nEssa opcao nao existe");
                        }
                    } else if (usuario ==2) {
                        System.out.println(menu.menuTurmas());
                        opcaoTurmas = ler.nextInt();

                        switch (opcaoTurmas){

                            case 1:
                                turmasSextoAno .mostrarChapas();
                                System.out.println("Agora escolha uma chapa para votar:");
                                opcaoChapas = ler.nextInt();
                                if (opcaoChapas == 1){
                                    turmasSextoAno.votacao.votar(1,professor,chapaSextoAno,turmasSextoAno); // nao sei como fazer o usuario informar o objeto
                                } else if ( opcaoChapas == 2) {
                                    turmasSextoAno.votacao.votar(1,professor, chapaSextoAno2, turmasSextoAno);
                                }else {
                                    System.out.println("Opcao invalida ");
                                }
                                break;

                            case 2:
                                turmasSetimoAno .mostrarChapas();
                                System.out.println("Agora escolha uma chapa para votar:");
                                opcaoChapas = ler.nextInt();
                                if (opcaoChapas == 1){
                                    turmasSetimoAno.votacao.votar(1,professor,chapaSetimoAno, turmasSetimoAno);
                                } else if ( opcaoChapas == 2) {
                                    turmasSetimoAno.votacao.votar(1,professor, chapaSetimoAno2,turmasSetimoAno);
                                }else {
                                    System.out.println("Opcao invalida ");
                                }
                                break;

                            case 3:
                                turmasOitavoAno .mostrarChapas();
                                System.out.println("Agora escolha uma chapa para votar:");
                                opcaoChapas = ler.nextInt();
                                if (opcaoChapas == 1){
                                    turmasOitavoAno.votacao.votar(1,professor,chapaOitavoAno,turmasOitavoAno);
                                } else if ( opcaoChapas == 2) {
                                    turmasOitavoAno.votacao.votar(1,professor,chapaOitavoAno,turmasOitavoAno);
                                }else {
                                    System.out.println("Opcao invalida ");
                                }
                                break;

                            case 4:
                                turmasNonoAno.mostrarChapas();
                                System.out.println("Agora escolha uma chapa para votar:");
                                opcaoChapas = ler.nextInt();
                                if (opcaoChapas == 1){
                                    turmasNonoAno.votacao.votar(1,professor,chapaNonoAno,turmasNonoAno);
                                } else if ( opcaoChapas == 2) {
                                    turmasNonoAno.votacao.votar(1,professor,chapaNonoAno2,turmasNonoAno);
                                }else {
                                    System.out.println("Opcao invalida ");
                                }
                                break;
                            default:
                                System.out.println("\nEssa opcao nao existe");
                        }

                    }else {
                        System.out.println("Opcao invalida");
                    }
                    break;

                case 5:
                    System.out.println("informe a turma que voce quer saber o resultado");
                    menu.menuTurmas();
                    opcaoTurmas = ler.nextInt();
                    if (opcaoTurmas == 1){
                        votacao.emitirResultado(turmasSextoAno);
                    } else if (opcaoTurmas == 2) {
                        votacao.emitirResultado(turmasSetimoAno);
                    } else if (opcaoTurmas == 3) {
                        votacao.emitirResultado(turmasOitavoAno);
                    } else if (opcaoTurmas == 4) {
                        votacao.emitirResultado(turmasNonoAno);
                    }else {
                        System.out.println("Essa turma nao existe no sistema ");
                    }

                    break;
                default:
                    break;
            }


        }
    }
}
