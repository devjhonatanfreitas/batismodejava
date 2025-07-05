import javax.swing.*;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Ninja {

    Scanner leitor = new Scanner(System.in);
    ArrayList listaDeNinjas = new ArrayList();

    String nome;
    int idade;
    String missao;
    String nivelDificuldade;
    String statusMissao;

    void mostrarInformacoes() {

        System.out.println("""
                
                SELECIONE UMA OPÇÃO
                
                1 - MOSTRAR UM NINJA ESPECÍFICO
                2 - MOSTRAR TODOS OS NINJAS
                
                """);
        int opcaoBusca = leitor.nextInt();
        leitor.nextLine();

        if (opcaoBusca == 1) {

            System.out.println("Digite o nome do ninja a ser buscado: ");
            String nomeBusca = leitor.nextLine();
            buscaPorNome(nomeBusca);

        } else if (opcaoBusca == 2) {
            mostrarTodos();
        } else {
            System.out.println("Opção inválida.");
        }
    }

    void adicionarNinja() {

        Ninja ninja = new Ninja();
        System.out.println("Insira o nome do ninja: ");
        ninja.nome = leitor.nextLine();
        System.out.println("Insira a idade do ninja: ");
        ninja.idade = leitor.nextInt();
        leitor.nextLine();
        System.out.println("Insira o nome da missão: ");
        ninja.missao = leitor.nextLine();
        System.out.println("Insira o nivel de dificuldade: ");
        ninja.nivelDificuldade = leitor.nextLine();
        System.out.println("Insira o status da missão: ");
        ninja.statusMissao = leitor.nextLine();
        listaDeNinjas.add(ninja);
    }

    void adicionarUchiha(){

        Uchiha uchiha = new Uchiha();
        System.out.println("Insira o nome do ninja: ");
        uchiha.nome = leitor.nextLine();
        System.out.println("Insira a idade do ninja: ");
        uchiha.idade = leitor.nextInt();
        leitor.nextLine();
        System.out.println("Insira o nome da missão: ");
        uchiha.missao = leitor.nextLine();
        System.out.println("Insira o nivel de dificuldade: ");
        uchiha.nivelDificuldade = leitor.nextLine();
        System.out.println("Insira o status da missão: ");
        uchiha.statusMissao = leitor.nextLine();
        uchiha.habilidadeEspecial = "Sharingan";
        listaDeNinjas.add(uchiha);

    }

    void buscaPorNome(String nomeBusca) {

        for (int i = 0; i < listaDeNinjas.size(); i++) {
            Ninja ninja = (Ninja) listaDeNinjas.get(i);
            if (ninja.nome.equalsIgnoreCase(nomeBusca)) {
                System.out.println("\n=== INFORMAÇÕES DO NINJA ===");
                System.out.println("Nome: " + ninja.nome);
                System.out.println("Idade: " + ninja.idade);
                if (ninja instanceof Uchiha) {
                    Uchiha uchiha = (Uchiha) ninja;
                    System.out.println("Habilidade Especial: " + uchiha.habilidadeEspecial);
                }
                System.out.println("Missão: " + ninja.missao);
                System.out.println("Nível de Dificuldade: " + ninja.nivelDificuldade);
                System.out.println("Status da Missão: " + ninja.statusMissao);
                System.out.println("============================\n");
                break;
            }
        }
    }

    void mostrarTodos(){

        System.out.println("\n=== LISTA DE TODOS OS NINJAS ===");

        for (int i = 0; i < listaDeNinjas.size(); i++) {
            Ninja ninja = (Ninja) listaDeNinjas.get(i);

            System.out.println("\n--- NINJA " + (i + 1) + " ---");
            System.out.println("Nome: " + ninja.nome);
            System.out.println("Idade: " + ninja.idade);
            if (ninja instanceof Uchiha) {
                Uchiha uchiha = (Uchiha) ninja;
                System.out.println("Habilidade Especial: " + uchiha.habilidadeEspecial);
                System.out.println("Tipo: Ninja da Família Uchiha");
            }
            System.out.println("Missão: " + ninja.missao);
            System.out.println("Nível de Dificuldade: " + ninja.nivelDificuldade);
            System.out.println("Status da Missão: " + ninja.statusMissao);

            System.out.println("------------------");
        }

        System.out.println("\nTotal de ninjas cadastrados: " + listaDeNinjas.size());
        System.out.println("================================\n");
    }
    void alteraHabilidade(){

        System.out.println("Digite o nome do ninja a ter a habilidade alterada: ");
        String nomeBuscado = leitor.nextLine();
        for (int i = 0; i < listaDeNinjas.size(); i++) {
            Ninja ninja = (Ninja) listaDeNinjas.get(i);
            if (ninja.nome.equalsIgnoreCase(nomeBuscado)) {
                if (ninja instanceof Uchiha) {
                    Uchiha uchiha = (Uchiha) ninja;
                    System.out.println("Insira o nome da nova habilidade: ");
                    uchiha.habilidadeEspecial = leitor.nextLine();
                } else {
                    System.out.println("O ninja não possui habilidades especiais.");
                }
            }
        }
    }

}


