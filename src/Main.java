import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("CPF: ");
        String cpf = sc.nextLine();

        System.out.print("Rua: ");
        String rua = sc.nextLine();

        System.out.print("Cidade: ");
        String cidade = sc.nextLine();

        System.out.print("UF: ");
        String uf = sc.nextLine();

        System.out.print("CEP: ");
        String cep = sc.nextLine();

        Endereco endereco = new Endereco(rua, cidade, uf, cep);

        System.out.println("Tipo: 1-Aluno 2-Professor 3-Técnico");
        int tipo = sc.nextInt();
        sc.nextLine();

        Pessoa pessoa = null;

        if (tipo == 1) {
            System.out.print("Matrícula: ");
            String mat = sc.nextLine();
            System.out.print("Curso: ");
            String curso = sc.nextLine();
            pessoa = new Aluno(nome, cpf, endereco, mat, curso);

        } else if (tipo == 2) {
            System.out.print("SIAPE: ");
            String siape = sc.nextLine();
            System.out.print("Área: ");
            String area = sc.nextLine();
            pessoa = new Professor(nome, cpf, endereco, siape, area);

        } else {
            System.out.print("Registro: ");
            String reg = sc.nextLine();
            System.out.print("Setor: ");
            String setor = sc.nextLine();
            pessoa = new Tecnico(nome, cpf, endereco, reg, setor);
        }

        // RENDIMENTOS
        String opc;
        do {
            System.out.println("\n1-Bolsa 2-Salário Professor 3-Salário Técnico");
            int op = sc.nextInt();

            sc.nextLine();
            System.out.print("Descrição: ");
            String desc = sc.nextLine();

            System.out.print("Valor base: ");
            double base = sc.nextDouble();

            System.out.print("Quantidade: ");
            int qtd = sc.nextInt();

            if (op == 1) {
                System.out.print("Tipo (1 integral / 2 parcial): ");
                int t = sc.nextInt();
                pessoa.adicionarRendimento(new Bolsa(desc, base, qtd, t));

            } else if (op == 2) {
                System.out.print("Titulação (1/2/3): ");
                int t = sc.nextInt();
                pessoa.adicionarRendimento(new SalarioProfessor(desc, base, qtd, t));

            } else {
                System.out.print("Nível (1/2/3): ");
                int n = sc.nextInt();
                pessoa.adicionarRendimento(new SalarioTecnico(desc, base, qtd, n));
            }

            sc.nextLine();
            System.out.print("Adicionar outro? (s/n): ");
            opc = sc.nextLine();

        } while (opc.equalsIgnoreCase("s"));

        pessoa.imprimirResumo();
    }
}