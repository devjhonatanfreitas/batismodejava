package NinjasList;

import java.util.LinkedList;

public class main {
    public static void main(String[] args) {

        Menu menu = new Menu();

        Ninja ninja1 = new Ninja("Kakashi Hatake", 29, "Vila da Folha");
        Ninja ninja2 = new Ninja("Kisame Hoshigaki", 32, "Vila da Névoa");
        Ninja ninja3 = new Ninja("Deidara", 19, "Vila da Pedra");
        Ninja ninja4 = new Ninja("Killer Bee", 35, "Vila da Nuvem");
        Ninja ninja5 = new Ninja("Hidan", 22, "Vila da Cachoeira");
        Ninja ninja6 = new Ninja("Sasori", 35, "Vila da Areia");
        Ninja ninja7 = new Ninja("Konan", 35, "Vila da Chuva");

        ListaDeNinjas<Ninja> listaDeNinjas = new ListaDeNinjas<>();
        listaDeNinjas.adicionarNinja(ninja1);
        listaDeNinjas.adicionarNinja(ninja2);
        listaDeNinjas.adicionarNinja(ninja3);
        listaDeNinjas.adicionarNinja(ninja4);
        listaDeNinjas.adicionarNinja(ninja5);
        listaDeNinjas.adicionarNinja(ninja6);
        listaDeNinjas.adicionarNinja(ninja7);

        menu.menu(listaDeNinjas);

    }
}
