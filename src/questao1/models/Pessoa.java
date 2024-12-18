package questao1.models;

public class Pessoa {
    private String nome;
    private int idade;
    private String numeroTelefone;

    public Pessoa(String nome, int idade, String numeroTelefone) {
        this.nome = nome;
        this.idade = idade;
        this.numeroTelefone = numeroTelefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", numeroTelefone='" + numeroTelefone + '\'' +
                '}';
    }
}
