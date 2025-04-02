import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("----EVENTO DE CARROS CLÁSSICOS----");

        Carro palio = new Carro("FIAT", "Palio", 1996, "HPS-2731", 0);

        print("Insira:\n[1]Acelerar\n[2]Frear");
        int decisao = scanner.nextInt();
        print("Insira valor: ");
        double valor = scanner.nextDouble();

        switch (decisao){
            case 1:
                palio.acelerar(valor);
                break;
            case 2:
                palio.frear(valor);
                break;
            default:
                print("Inválido");
                break;
        }

        String space = tab(7);

        print("Marca:" + space + palio.getMarca() + "\nModelo:"+ space + palio.getModelo() + "\nAno:"+ space + palio.getAno() + "\nPlaca:" + space + palio.getPlaca() + "\nVelocidade:" + space + palio.getVelocidadeAtual());
    }

    public static void print(String string){
        System.out.println(string);
    }

    public static String tab(int space){
        String paragrafo = "";
        for (int i = 0; i < space; i++){
            paragrafo += "\t";
        }
        return paragrafo;
    }
}