import java.util.ArrayList;

public class Historico {
   private static ArrayList<String> historico = new ArrayList<>();
    public static  void adicionar(String operacaoRealizada){
        historico.add(operacaoRealizada);
    }
    public static  void buscarHistorico(){
        for (String elemento : historico){
            System.out.println(elemento);
        }

    }
}
