public class Endereco {
    private String rua, cidade, uf, cep;

    public Endereco(String rua, String cidade, String uf, String cep) {
        this.rua = rua;
        this.cidade = cidade;
        this.uf = uf;
        this.cep = cep;
    }

    public String toString() {
        return rua + ", " + cidade + " - " + uf + " | CEP: " + cep;
    }
}