public class Calculador {
    public double num1;
    public double num2;
    public Calculador(double num1, double num2){
        super();
        this.num1= num1;
        this.num2= num2;
    }
    public double realizaCalculo (double num1, double num2, Operacao operacao){
        double valor = operacao.calcular(num1, num2);
        return valor;
    }
}
