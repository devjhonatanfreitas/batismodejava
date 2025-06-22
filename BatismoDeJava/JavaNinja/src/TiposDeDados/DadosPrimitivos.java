package TiposDeDados;

public class DadosPrimitivos {
    public static void main(String[] args) {

        /*
        * Dados primitivos - int, double, float , char, boolean, short.
        * Objetivo da aula: Criar um ninja - Naruto
        * */

        int idade = 16; // Valor maximo int = 2 147 483 647
        double altura = 1.65;
        char inicial = 'N';
        boolean vivoOuMorto = true;
        Long saldoBancario = 999999L; // Valor maximo long: 9 223 372 036 854 775 807

        System.out.println(idade); // Comando para mostrar algo para o usuário
        System.out.println(saldoBancario);
        System.out.println("saldoBancario = " + saldoBancario); // soutv - ultima variavel declarada
        System.out.println("Minha idade é: "+idade);
    }
}
