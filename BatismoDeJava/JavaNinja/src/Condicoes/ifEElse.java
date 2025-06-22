package Condicoes;

public class ifEElse {
    public static void main(String[] args) {

        /*
        * IF e ELSE - Condicoes
        * else if
        * Objetivo: passar o ninja de nivel de acordo com o numero de missoes
        * */

        String nome = "Naruto Uzumaki";
        String rank;
        int idade = 16;
        boolean hokage = false;
        short numeroDeMissoes = 20;

        // se (condicao) {faca isso}
        if (numeroDeMissoes == 10 && idade > 15) {
            System.out.println("Rank: Chuunin");
        } else if (numeroDeMissoes >= 20){
            System.out.println("Rank: Jounin");
        } else {
            System.out.println("Rank: Genin");
        }

    }
}


