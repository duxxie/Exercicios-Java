import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora 3000");

        System.out.println("Insira num1: ");
        double num1 = scanner.nextDouble();
        System.out.println("Insira num2: ");
        double num2 = scanner.nextDouble(), resultado = 0;

        System.out.println("Insira operador(+,-,*,/): ");
        String operador = scanner.next();

        switch (operador) {
            case "+":
                resultado = Calculadora.soma(num1,num2);
                break;
            case "-":
                resultado = Calculadora.subtracao(num1,num2);
                break;
            case "*":
                resultado = Calculadora.multiplicacao(num1,num2);
                break;
            case "/":
                resultado = Calculadora.divisao(num1,num2);
                break;
        }

        System.out.println("Resultado: " + resultado);
    }
}