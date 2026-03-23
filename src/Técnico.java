public class Tecnico extends Pessoa {
    private String registro, setor;

    public Tecnico(String nome, String cpf, Endereco endereco, String registro, String setor) {
        super(nome, cpf, endereco);
        this.registro = registro;
        this.setor = setor;
    }

    @Override
    public String getDadosEspecificos() {
        return "Técnico | Registro: " + registro + " | Setor: " + setor;
    }
}