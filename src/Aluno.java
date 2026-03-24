public class Aluno extends Pessoa {
    private String matricula, curso;

    public Aluno(String nome, String cpf, Endereco endereco, String matricula, String curso) {
        super(nome, cpf, endereco);
        this.matricula = matricula;
        this.curso = curso;
    }

    @Override
    public String getDadosEspecificos() {
        return "Aluno | Matrícula: " + matricula + " | Curso: " + curso;
    }
}