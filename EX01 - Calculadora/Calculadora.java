public class Calculadora {

    double num1;
    double num2;

        static public double soma(double num1,double num2){
            return num1 + num2;
        }
        static public double subtracao(double num1,double num2){
            return num1 - num2;
        }
        static public double multiplicacao (double num1,double num2){
            return num1 * num2;
        }
        static public double divisao (double num1,double num2){
            if (num1 == 0 && num2 == 0){
                System.out.println("Erro");
                return 0;
            }
            return num1 / num2;

        }

}
