import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        print("-------Sistema de Jogador-------");

        Jogador felipe = new Jogador("Felipe", 0, 1);

        print("> [1] Para aumentar Pontuação de Jogador\n> [2] Para aumentar Nível de Jogador:\n> [3] Para mudar o nome do Jogador: ");
        int decisao = scanner.nextInt();

        switch (decisao){
            case 1:
                print("Insira Pontuação");
                int pontuacao = scanner.nextInt();
                felipe.maisPontuacao(pontuacao);
                break;
            case 2:
                print("Insira Nível");
                int nivel = scanner.nextInt();
                felipe.maisNivel(nivel);
                break;
            case 3:
                print("Insira novo Nome: ");
                String novoNome = scanner.next();
                felipe.mudarNome(novoNome);
                break;
            default:
                print("Inválido.");
                break;
        }

        print("Nome:\t" + felipe.getNome() + "\nNível:\t"+ felipe.getNivel() + "\nPontuação:\t" + felipe.getPontuacao());
    }

    public static void print(String string){
        System.out.println(string);
        return;
    }
}