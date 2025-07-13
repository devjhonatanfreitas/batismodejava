package NinjasList;

public class Ninja {

    private String nome;
    private int idade;
    private String aldeia;

    public Ninja() {
    }

    public Ninja(String nome, int idade, String aldeia) {
        this.nome = nome;
        this.idade = idade;
        this.aldeia = aldeia;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getAldeia() {
        return aldeia;
    }

    @Override
    public String toString() {
        return "Nome = " + nome +
                ", Idade = " + idade +
                ", Aldeia = " + aldeia;
    }
}
