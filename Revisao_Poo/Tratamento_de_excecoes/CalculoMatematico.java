package Tratamento_de_excecoes;

public class CalculoMatematico {
    public int divisao(int num1, int num2) throws DivisorZeroException {
        if (num1 == 0 || num2 ==0){
            throw new DivisorZeroException();
        }
        return num1/ num2;
    }
}
