package NinjasList;

import java.util.Scanner;

public class Menu {

    Scanner leitor = new Scanner(System.in);
    ListaDeNinjas listaDeNinjas = new ListaDeNinjas();

    public void exibirMenu(ListaDeNinjas<Ninja> listaDeNinjas) {

        System.out.println("""
                
                -------- Cadastro de Ninjas --------
                
                1 - Exibir lista completa
                2 - Remover um ninja
                3 - Adicionar um ninja
                4 - Ordenar Lista
                5 - Buscar ninja
                6 - Sair
                
                -------- Cadastro de Ninjas --------
                
                """
        );
    }

    public void menu(ListaDeNinjas<Ninja> listaDeNinjas){

        int opcaoEscolhida;
            do {
                exibirMenu(listaDeNinjas);
                System.out.println("Escolha uma opção: ");
                opcaoEscolhida = leitor.nextInt();
                leitor.nextLine();
                switch (opcaoEscolhida) {
                    case 1:
                        listaDeNinjas.exibirLista();
                        break;
                    case 2:
                        break;
                    case 3:
                        addNinja(listaDeNinjas);
                        break;
                    case 4:
                        menuOrdenacao(listaDeNinjas);
                        break;
                    case 5:
                        buscarPorNome(listaDeNinjas);
                        break;
                }
            } while (opcaoEscolhida !=6);
    }

    public void menuOrdenacao(ListaDeNinjas<Ninja> listaDeNinjas){

        int opcaoOrdenacao;


        System.out.println("""
            
            -------- Como deseja ordenar? --------
            
            1 - Ordenar por nome
            2 - Ordenar por idade
            3 - Ordenar por vila
            4 - Sair
            
            """
        );

        System.out.println("Escolha uma opção: ");
        opcaoOrdenacao = leitor.nextInt();
        leitor.nextLine();

        switch (opcaoOrdenacao){
            case 1:
                listaDeNinjas.ordenarPorNome();
                break;
            case 2:
                listaDeNinjas.ordenarPorIdade();
                break;
            case 3:
                listaDeNinjas.ordenarPorAldeia();
                break;
            case 4:
                System.out.println("Saindo");
                break;
            default:
                System.out.println("Opcão inválida");
                break;
        }
    }
    public void addNinja(ListaDeNinjas<Ninja> listaDeNinjas){

        System.out.println("Insira o nome do ninja: ");
        String nomeAdd = leitor.nextLine();
        System.out.println("Insira a idade do ninja: ");
        int idadeAdd = leitor.nextInt();
        leitor.nextLine();
        System.out.println("Insira a vila do ninja: ");
        String vilaAdd = leitor.nextLine();

        Ninja ninja = new Ninja(nomeAdd, idadeAdd, vilaAdd);
        listaDeNinjas.adicionarNinja(ninja);

    }

    public void buscarPorNome(ListaDeNinjas<Ninja> listaDeNinjas) {
        System.out.println("Digite o nome do ninja que deseja buscar: ");
        String nomeBusca = leitor.nextLine();

        Ninja ninjaEncontrado = (Ninja) listaDeNinjas.buscarNinjaPorNome(nomeBusca);

        if (ninjaEncontrado != null) {
            System.out.println("Ninja encontrado:");
            System.out.println(ninjaEncontrado);
        } else {
            System.out.println(nomeBusca + "' não foi encontrado na lista.");
        }
    }
}