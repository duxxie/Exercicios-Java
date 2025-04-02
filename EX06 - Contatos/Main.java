import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Agenda agenda = new Agenda();
        String decisao;

        do {
            System.out.println("> [1] Adicionar contato");
            System.out.println("> [2] Buscar contato por nome");
            System.out.println("> [3] Listar todos os contatos");
            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Insira Nome do contato: ");
                    String nome = scanner.next();
                    System.out.println("Insira número do contato: ");
                    String telefone = scanner.next();
                    agenda.adicionarContato(nome, telefone);
                    break;

                case 2:
                    System.out.println("Insira nome do contato que deseja buscar: ");
                    String busca = scanner.next();
                    Contato contatoEncontrado = agenda.buscarContato(busca);
                    if (contatoEncontrado != null) {
                        System.out.println("Contato encontrado: " + contatoEncontrado.getNome() + " - " + contatoEncontrado.getTelefone());
                    } else {
                        System.out.println("Contato não encontrado.");
                    }
                    break;

                case 3:
                    agenda.listarContatos();
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

            System.out.println("Deseja continuar? (S/N)");
            decisao = scanner.next();
        } while (decisao.equalsIgnoreCase("s"));

        System.out.println("Programa encerrado.");
        scanner.close();
    }
}
