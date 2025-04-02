import java.util.ArrayList;

class Agenda {
    private ArrayList<Contato> contatos;

    public Agenda() {
        this.contatos = new ArrayList<>();
    }

    public void adicionarContato(String nome, String telefone) {
        contatos.add(new Contato(nome, telefone));
        System.out.println("Contato adicionado.");
    }

    public Contato buscarContato(String nome) {
        for (Contato c : contatos) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                return c;
            }
        }
        return null;
    }

    public void listarContatos() {
        if (contatos.isEmpty()) {
            System.out.println("Nenhum contato na agenda.");
        } else {
            System.out.println("Lista de contatos:");
            for (Contato c : contatos) {
                System.out.println(c.getNome() + " - " + c.getTelefone());
            }
        }
    }
}