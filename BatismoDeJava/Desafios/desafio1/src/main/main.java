/*Crie um programa que represente três ninjas da Vila
da Folha (Konoha) de "Naruto" e suas respectivas
missões.
Cada ninja tem um nome, uma idade e uma missão
atribuída a ele, com o nome da missão, nível de
dificuldade e status de conclusão

Identifique os tipos de dados
que voce vai precisar. Ex:
String, int

Crie variáveis por exemplo,
String nomeNinja1 = "Naruto";
para o nome de um ninja)...

Imprima os dados: Use
System.out.println para
mostrar as informações.


Q uer m a is dificuld a de?

Use condicionais para verificar se o ninja pode concluir a missão baseado na sua idade:

Altere o status da missão para "concluída" ou "não concluída" de acordo com essa lógica e
imprima o resultado.
Altere o status da missão para "concluída" ou "não concluída" de acordo com essa lógica
e imprima o resultado.
Ninjas menores de 15 anos só podem concluir missões de nível C ou D. Ninjas com 15 anos
ou mais podem concluir missões de qualquer nível.
*/

package main;

public class main {

    public static void main(String[] args) {

        String nomeNinja1 = "Rock Lee";
        String nomeNinja2 = "Neji Hyuuga";
        String nomeNinja3 = "Tenten";

        int idadeNinja1 = 14;
        int idadeNinja2 = 14;
        int idadeNinja3 = 16;

        String missaoNinja1 = "Missão de Captura do Gato Tora";
        String missaoNinja2 = "Missão de Escolta do Comerciante";
        String missaoNinja3 = "Missão de Limpeza do Rio";

        char nivelMissao1 = 'D';
        char nivelMissao2 = 'C';
        char nivelMissao3 = 'D';

        boolean statusConclusaoMissao1;
        boolean statusConclusaoMissao2;
        boolean statusConclusaoMissao3;


        System.out.println("Nome: "+nomeNinja1);
        System.out.println("Idade: "+idadeNinja1);
        System.out.println("Missão: "+missaoNinja1);
        System.out.println("Nível da missão: "+nivelMissao1);

        if (nivelMissao1 == 'C' || nivelMissao1 == 'D'){
            statusConclusaoMissao1 = true;
            System.out.println("Missão Concluída");
        } else if (idadeNinja1 >= 15){
            statusConclusaoMissao1 = true;
            System.out.println("Missão Concluída");
        } else {
            statusConclusaoMissao1 = false;
            System.out.println("Missão Não Concluída");
        }

        System.out.println("--------------------------------------------------");

        System.out.println("Nome: "+nomeNinja2);
        System.out.println("Idade: "+idadeNinja2);
        System.out.println("Missão: "+missaoNinja2);
        System.out.println("Nível da missão: "+nivelMissao2);

        if (nivelMissao2 == 'C' || nivelMissao2 == 'D'){
            statusConclusaoMissao2 = true;
            System.out.println("Missão Concluída");
        } else if (idadeNinja2 >= 15){
            statusConclusaoMissao2 = true;
            System.out.println("Missão Concluída");
        } else {
            statusConclusaoMissao2 = false;
            System.out.println("Missão Não Concluída");
        }

        System.out.println("--------------------------------------------------");

        System.out.println("Nome: "+nomeNinja3);
        System.out.println("Idade: "+idadeNinja3);
        System.out.println("Missão: "+missaoNinja3);
        System.out.println("Nível da missão: "+nivelMissao3);

        if (nivelMissao3 == 'C' || nivelMissao3 == 'D'){
            statusConclusaoMissao3 = true;
            System.out.println("Missão Concluída");
        } else if (idadeNinja3 >= 15){
            statusConclusaoMissao3 = true;
            System.out.println("Missão Concluída");
        } else {
            statusConclusaoMissao3 = false;
            System.out.println("Missão Não Concluída");
        }

    }
}
