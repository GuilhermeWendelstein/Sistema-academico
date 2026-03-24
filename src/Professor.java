public class Professor extends Pessoa {
    private String siape, area;

    public Professor(String nome, String cpf, Endereco endereco, String siape, String area) {
        super(nome, cpf, endereco);
        this.siape = siape;
        this.area = area;
    }

    @Override
    public String getDadosEspecificos() {
        return "Professor | SIAPE: " + siape + " | Área: " + area;
    }
}