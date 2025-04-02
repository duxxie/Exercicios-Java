import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("-----Banco 3000-----");

        ContaBancaria rogerio = new ContaBancaria(1,"Rogério Silva", 4000);

        System.out.println("> [1] para depositar\n> [2] para sacar:");
        int decisao = scanner.nextInt();

        System.out.print("Digite o valor: ");
        double valor = scanner.nextDouble();

        switch (decisao){
            case 1:
                rogerio.depositar(valor);
                break;
            case 2:
                rogerio.sacar(valor);
                break;
            default:
                System.out.println("Invalido.");
                break;
        }

        System.out.println("> Saldo da conta: " + rogerio.getSaldo());

    }
}