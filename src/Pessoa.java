import java.util.ArrayList;
import java.util.List;

public abstract class Pessoa {
    protected String nome;
    protected String cpf;
    protected Endereco endereco;
    protected List<Rendimento> rendimentos = new ArrayList<>();

    public Pessoa(String nome, String cpf, Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public void adicionarRendimento(Rendimento r) {
        rendimentos.add(r);
    }

    public double calcularTotal() {
        double total = 0;
        for (Rendimento r : rendimentos) {
            total += r.getSubtotal();
        }
        return total;
    }

    public abstract String getDadosEspecificos();

    public void imprimirResumo() {
        System.out.println("\n=== RESUMO ===");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Endereço: " + endereco);

        System.out.println(getDadosEspecificos());

        System.out.println("\nRendimentos:");
        for (Rendimento r : rendimentos) {
            System.out.println(
                    r.getDescricao() +
                            " | Base: " + r.getValorBase() +
                            " | Calculado: " + r.calcularValor() +
                            " | Qtd: " + r.getQuantidade() +
                            " | Subtotal: " + r.getSubtotal()
            );
        }

        System.out.println("TOTAL: " + calcularTotal());
    }
}