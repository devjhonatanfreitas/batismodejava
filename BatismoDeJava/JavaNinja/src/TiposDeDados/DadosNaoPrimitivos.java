package TiposDeDados;

public class DadosNaoPrimitivos {
    public static void main(String[] args) {

        /*
        * Dados nao primitivos: String, Array, Class, enum
        * Objetivo: Criar um ninja, e atribuir metodos a ele.
        * */

        String nome = "Naruto Uzumaki";
        String nomeUpperCase = nome.toUpperCase(); // toUpperCase vai colocar tudo em Capslock
        System.out.println("Esse texto está em CAPSLOCK: "+nomeUpperCase);
        System.out.println("Esse texto está normal: "+nome);

        String aldeia = "ALDEIA DA FOLHA";
        String aldeiaEmCaixaBaixa = aldeia.toLowerCase(); // toLowerCase vai colocar tudo em caixa baixa
        System.out.println(aldeiaEmCaixaBaixa);
    }
}
