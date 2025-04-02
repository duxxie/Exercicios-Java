import java.util.Scanner;

public class ContaBancaria {
    private double numeroConta;
    private String nomeTitular;
    private double saldo;

    ContaBancaria(double numeroConta, String nomeTitular, double saldo){
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
    }

    public static void invalidar(){
        System.out.println("Inválido.");
        return;
    }

    public void depositar(double valor){
        if (valor <= 0){
            invalidar();
            return;
        }
        saldo += valor;
        System.out.println("Deposito de " + valor + " Feito.");
        return;
    }

    public void sacar(double valor) {
        if (saldo < valor || valor <= 0){
            invalidar();
            return;
        }
        saldo -= valor;
        System.out.println("Saque de " + valor + " Feito.");
        return;
    }

    public double getSaldo() {
        return saldo;
    }
}
