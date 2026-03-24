public class SalarioProfessor extends Rendimento {
    private int titulacao; // 1 grad, 2 mest, 3 dout

    public SalarioProfessor(String descricao, double valorBase, int quantidade, int titulacao) {
        super(descricao, valorBase, quantidade);
        this.titulacao = titulacao;
    }

    @Override
    public double calcularValor() {
        switch (titulacao) {
            case 2: return valorBase * 1.2;
            case 3: return valorBase * 1.4;
            default: return valorBase;
        }
    }
}