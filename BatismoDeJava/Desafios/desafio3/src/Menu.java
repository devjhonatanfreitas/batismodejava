import java.util.Scanner;

public class Menu {

    Scanner leitor = new Scanner(System.in);
    Ninja ninja = new Ninja();

    int opcaoEscolhida;

    void mostrarMenu() {

        do {

            System.out.println("""
                
                MENU PRINCIPAL
                1 - MOSTRAR INFORMAÇÕES
                2 - ADICIONAR NOVO NINJA
                3 - ATUALIZAR HABILIDADE ESPECIAL
                4 - SAIR
                
                """);
            opcaoEscolhida = leitor.nextInt();
            leitor.nextLine();

            switch (opcaoEscolhida) {
                case 1:
                    ninja.mostrarInformacoes();
                    break;
                case 2:
                    System.out.println("""
                            
                            ADICIONAR UM NINJA
                            
                            1 - NINJA COMUM
                            2 - UCHIHA
                            
                            """);
                    int opcaoAdd = leitor.nextInt();
                    leitor.nextLine();
                    if (opcaoAdd == 1) {
                        ninja.adicionarNinja();
                    } else if (opcaoAdd == 2){
                        ninja.adicionarUchiha();
                    } else {
                        System.out.println("Opção inválida.");
                    }
                    break;
                case 3:
                    ninja.alteraHabilidade();
                    break;
                case 4:
                    System.out.println("Encerrando");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    mostrarMenu();
            }
        } while (opcaoEscolhida != 4);
    }
}