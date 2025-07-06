public class NinjaAvancado implements Ninja{

    String nome;
    int idade;
    String habilidade;
    String especialidade;
    TipoHabilidade tipoHabilidade;

    public NinjaAvancado(String nome, int idade, String habilidade, String especialidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
        this.especialidade = especialidade;
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("--------------------------------------");
        System.out.println("Nome: "+nome);
        System.out.println("Idade: "+idade);
        System.out.println("Habilidade: "+habilidade);
        System.out.println("Tipo de Habilidade: "+tipoHabilidade);
        System.out.println("Especialidade: "+especialidade);
        System.out.println("--------------------------------------\n");
    }

    @Override
    public void executarHabilidade() {
        System.out.println("Habilidade "+habilidade+" executada, corram!");
    }
}
