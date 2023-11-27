package VotacaoEscolar;

public class Menu {
    public String menuPrincial(){
        String menu ="";
        menu =  "1 - Cadastrar chapas\n" +
                "2 - Iniciar o processo de votacao\n" +
                "3 - Encerrar o processo de votacao\n" +
                "4 - Realizar uma votacao\n" +
                "5 - Emitir resultado\n" +
                "6 - Sair do Sistema ";
        return  menu;
    }

    public String menuTurmas(){
        String menu = "Informe sua turma:\n" +
                "1- sexto ano \n" +
                "2- setimo ano\n" +
                "3- oitavo ano\n" +
                "4- nono ano";
        return menu;
    }
}
