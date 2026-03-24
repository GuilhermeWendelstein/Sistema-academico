public abstract class Rendimento implements Calculavel {
    protected String descricao;
    protected double valorBase;
    protected int quantidade;

    public Rendimento(String descricao, double valorBase, int quantidade) {
        this.descricao = descricao;
        this.valorBase = valorBase;
        this.quantidade = quantidade;
    }

    public abstract double calcularValor();

    public double getSubtotal() {
        return calcularValor() * quantidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValorBase() {
        return valorBase;
    }

    public int getQuantidade() {
        return quantidade;
    }
}