public class SalarioTecnico extends Rendimento {
    private int nivel; // 1 junior, 2 pleno, 3 senior

    public SalarioTecnico(String descricao, double valorBase, int quantidade, int nivel) {
        super(descricao, valorBase, quantidade);
        this.nivel = nivel;
    }

    @Override
    public double calcularValor() {
        switch (nivel) {
            case 2: return valorBase * 1.15;
            case 3: return valorBase * 1.30;
            default: return valorBase;
        }
    }
}