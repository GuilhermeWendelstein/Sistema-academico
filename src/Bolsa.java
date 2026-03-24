public class Bolsa extends Rendimento {
    private int tipo; // 1 integral, 2 parcial

    public Bolsa(String descricao, double valorBase, int quantidade, int tipo) {
        super(descricao, valorBase, quantidade);
        this.tipo = tipo;
    }

    @Override
    public double calcularValor() {
        if (tipo == 1) {
            return valorBase;
        } else {
            return valorBase * 0.5;
        }
    }
}