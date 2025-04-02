import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Produto {
    private String nome;
    private int codigo;
    private double preco;
    private int quantidade;

    public Produto(String nome, int codigo, double preco, int quantidade) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public int getCodigo() {
        return codigo;
    }

    public void atualizarProduto(double preco, int quantidade) {
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getValorTotal() {
        return preco * quantidade;
    }

    @Override
    public String toString() {
        return "Código: " + codigo + ", Nome: " + nome + ", Preço: R$" + String.format("%.2f", preco) + ", Quantidade: " + quantidade;
    }
}

public class GerenciadorEstoque {
    private static List<Produto> estoque = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("\n1. Adicionar Produto");
            System.out.println("2. Atualizar Produto");
            System.out.println("3. Remover Produto");
            System.out.println("4. Listar Estoque");
            System.out.println("5. Gerar Relatório");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    adicionarProduto();
                    break;
                case 2:
                    atualizarProduto();
                    break;
                case 3:
                    removerProduto();
                    break;
                case 4:
                    listarEstoque();
                    break;
                case 5:
                    gerarRelatorio();
                    break;
                case 6:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 6);
    }

    private static void adicionarProduto() {
        System.out.print("Nome do produto: ");
        String nome = scanner.nextLine();
        System.out.print("Código do produto: ");
        int codigo = scanner.nextInt();
        System.out.print("Preço do produto: ");
        double preco = scanner.nextDouble();
        System.out.print("Quantidade em estoque: ");
        int quantidade = scanner.nextInt();
        scanner.nextLine();

        estoque.add(new Produto(nome, codigo, preco, quantidade));
        System.out.println("Produto adicionado com sucesso!");
    }

    private static void atualizarProduto() {
        System.out.print("Digite o código do produto para atualizar: ");
        int codigo = scanner.nextInt();
        scanner.nextLine();

        for (Produto produto : estoque) {
            if (produto.getCodigo() == codigo) {
                System.out.print("Novo preço: ");
                double novoPreco = scanner.nextDouble();
                System.out.print("Nova quantidade: ");
                int novaQuantidade = scanner.nextInt();
                scanner.nextLine();

                produto.atualizarProduto(novoPreco, novaQuantidade);
                System.out.println("Produto atualizado com sucesso!");
                return;
            }
        }
        System.out.println("Produto não encontrado!");
    }

    private static void removerProduto() {
        System.out.print("Digite o código do produto para remover: ");
        int codigo = scanner.nextInt();
        scanner.nextLine();

        boolean removido = estoque.removeIf(produto -> produto.getCodigo() == codigo);
        if (removido) {
            System.out.println("Produto removido com sucesso!");
        } else {
            System.out.println("Produto não encontrado!");
        }
    }

    private static void listarEstoque() {
        if (estoque.isEmpty()) {
            System.out.println("Estoque vazio!");
            return;
        }
        System.out.println("\nProdutos no estoque:");
        for (Produto produto : estoque) {
            System.out.println(produto);
        }
    }

    private static void gerarRelatorio() {
        if (estoque.isEmpty()) {
            System.out.println("Nenhum produto no estoque!");
            return;
        }
        double valorTotal = estoque.stream().mapToDouble(Produto::getValorTotal).sum();
        System.out.println("\nRelatório de Estoque:");
        System.out.println("Total de produtos: " + estoque.size());
        System.out.println("Valor total em estoque: R$" + String.format("%.2f", valorTotal));
    }
}
