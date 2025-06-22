package Condicoes;

public class Ternarios {
    public static void main(String[] args) {

        /*
        * Ternarios: maneiras de reduzir o codigo
        * variavel = (condição) ? valorSeVerdadeiro : valorFalso;
        * */

        short numeroDeMissoes = 1;
        String nivel = (numeroDeMissoes >= 10) ? "Chuunin" : "Genin";
        System.out.println(nivel);

    }
}

