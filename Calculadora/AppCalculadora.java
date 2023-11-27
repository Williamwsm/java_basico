import java.util.ArrayList;
import java.util.Scanner;

public class AppCalculadora {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        double resultado = 0;
        while (true) {

            System.out.println("\n\n \t\t CALCULADORA \n");
            System.out.println("Digite o numero da operaçao que voce deseja realizar ");
            System.out.println("1- Adicao");
            System.out.println("2- Subtracao");
            System.out.println("3- Mutiplicacao");
            System.out.println("4- Divisao");
            System.out.println("5- Potencia");
            System.out.println("6- Raiz");
            System.out.println("0- Sair\n");
            int opcao = ler.nextInt();
            if (opcao == 0) {
                break;
            }
            System.out.println("Informe um numero ");
            double num1 = ler.nextDouble();
            System.out.println("Informe mais um numero ");
            double num2 = ler.nextDouble();

            Calculador calculadora = new Calculador(num1, num2);
            try {
                switch (opcao) {
                    case 1:
                        resultado = calculadora.realizaCalculo(num1, num2, new Adicao());
                        break;
                    case 2:
                        resultado = calculadora.realizaCalculo(num1, num2, new Subtracao());
                        break;
                    case 3:
                        resultado = calculadora.realizaCalculo(num1, num2, new Multiplicacao());
                        break;
                    case 4:
                        Validacao.validacaoComNumeroZero(num2, new Divisao());
                        resultado = calculadora.realizaCalculo(num1, num2, new Divisao());
                        break;
                    case 5:
                        resultado = calculadora.realizaCalculo(num1,num2,new Potencia());
                    case 6:
                        resultado = calculadora.realizaCalculo(num1,num2, new Raiz());
                    default:
                        System.out.println("A opcao informada nao foi encontrada" +
                                "por favor tente novamente digitando as opcoes apresentada no menu ");
                }
                String dados = "num1: "+ num1+" num2: "+num2+ " resultado: "+ resultado;
                Historico.adicionar(dados);
                
            }catch (RuntimeException e){
                System.out.println(e.getMessage());
            }
    }
        System.out.println(" Lista de operaçoes ");
        Historico.buscarHistorico();


        }
    }
