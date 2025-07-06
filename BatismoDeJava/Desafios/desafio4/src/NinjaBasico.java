public class NinjaBasico implements Ninja{

    String nome;
    int idade;
    String habilidade;
    TipoHabilidade tipoHabilidade;

    public NinjaBasico(String nome, int idade, String habilidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("--------------------------------------");
        System.out.println("Nome: "+nome);
        System.out.println("Idade: "+idade);
        System.out.println("Habilidade: "+habilidade);
        System.out.println("Tipo de Habilidade: "+tipoHabilidade);
        System.out.println("--------------------------------------\n");
    }

    @Override
    public void executarHabilidade() {
        System.out.println("Habilidade "+habilidade+" executada, corram!");
    }
}
