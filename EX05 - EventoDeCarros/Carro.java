public class Carro {
    //'marca’, ‘modelo’, ‘ano’, ‘placa’ e ‘velocidadeAtual’
    private String marca;
    private String modelo;
    private int ano;
    private String placa;
    private double velocidadeAtual;

    Carro(String marca,String modelo, int ano, String placa, double velocidadeAtual){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
        this.velocidadeAtual = velocidadeAtual;
    }

    public void acelerar(double valor){
        velocidadeAtual += valor;
    }

    public void frear(double valor){
        velocidadeAtual -= valor;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public String getPlaca() {
        return placa;
    }

    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }
}
