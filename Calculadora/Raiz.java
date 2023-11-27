public class Raiz  implements Operacao{
    @Override
    public double calcular(double num1, double num2){
        return (Math.pow(num1, 1/num2));

    }
}
