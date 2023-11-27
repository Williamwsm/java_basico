package Tratamento_de_excecoes;

public class Test {
    public static void main(String[] args) {
        CalculoMatematico calculo = new CalculoMatematico();

        try {
            System.out.println(calculo.divisao(4 , 0));
        }catch (DivisorZeroException e){
            System.out.println( e.getMessage());
        }

    }
}
