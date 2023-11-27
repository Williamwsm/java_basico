package Tratamento_de_excecoes;

public class DivisorZeroException extends Throwable {

    public String getMessage(){
        return  "Nao existe divisao por zero";

    }
}
