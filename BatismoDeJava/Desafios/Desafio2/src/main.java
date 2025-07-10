import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        String[] listaDeNinjas = new String[5];
        int opcaoEscolhida;
        int totalDeNinjas = 0;

        do {
            System.out.println("""
                    ----------------------
                    Escolha uma opção:
                    
                    1 - Cadastrar Ninja
                    2 - Mostrar informações
                    3 - Sair
                    ----------------------
                    """);
            opcaoEscolhida = leitor.nextInt();
            leitor.nextLine();
            switch (opcaoEscolhida){
                case 1:
                    if (totalDeNinjas == 5){
                        System.out.println("Limite de ninjas cadastrados atingido.");
                        break;
                    } else {
                        System.out.println("Digite o nome do ninja: ");
                        String ninjaCadastrado = leitor.nextLine();
                        listaDeNinjas[totalDeNinjas] = ninjaCadastrado;
                        totalDeNinjas++;
                    }
                    break;
                case 2:
                    for (int i = 0; i < listaDeNinjas.length; i++) {
                        System.out.println(listaDeNinjas[i]);
                    }
                    break;
                case 3:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcaoEscolhida != 3);

    }
}
