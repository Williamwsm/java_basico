public class Validacao {
    public static void validacaoComNumeroZero(double numero, Operacao operacao ) {
        if (numero == 0 && operacao instanceof Divisao) {
            throw new RuntimeException("Numero nao pode ser zero");

        }

    }
}

