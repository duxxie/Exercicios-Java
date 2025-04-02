public class Jogador {
    private String nome;
    private int pontuacao;
    private int nivel;

    Jogador(String nome, int pontuacao, int nivel){
        this.nome = nome;
        this.pontuacao = pontuacao;
        this.nivel = nivel;
    }

    public void maisPontuacao(double valor){
        pontuacao += valor;
        return;
    }

    public void maisNivel(double valor){
        pontuacao += valor;
    }

    public void mudarNome(String novoNome){
        nome = novoNome;
    }

    public String getNome() {
        return nome;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public int getNivel() {
        return nivel;
    }
}
