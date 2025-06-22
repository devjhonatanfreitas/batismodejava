package Condicoes;

import java.util.Scanner;

public class EstudoSwitchCases {
    public static void main(String[] args) {

        /*
        * SwitchCases: servem para gerar casos específicos
        * Objetivo: Pedir ao usuário que escolha um entre os ninjas
        * */

        // Pedir ao usuário
        Scanner scanner = new Scanner(System.in);

        //Mostrar opções para o usuário
        System.out.println("Escolha um personagem: ");
        System.out.println("1 - Naruto Uzumaki");
        System.out.println("2 - Sasuke Uchiha");
        System.out.println("3 - Sakura Haruno");

        //Pedir para o usuário escolher uma opção
        int escolhaDoUsuario = scanner.nextInt();

        //Reação ao escolher um personagem
        switch (escolhaDoUsuario){
            case 1:
                System.out.println("O usuário escolheu o Naruto Uzumaki, o próximo Hokage");
                break;
            case 2:
                System.out.println("O usuário escolheu o Sasuke Uchiha, o ninja mais revoltado");
                break;
            case 3:
                System.out.println("O usuário escolheu a Sakura Haruno, personagem feminina mais legal");
                break;
            default:
                System.out.println("Você não digitou uma resposta válida, tente de novo.");
        }

        //Fechar a caixa de texto
        scanner.close();

    }
}
