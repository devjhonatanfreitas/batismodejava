package NinjasList;

import java.util.Comparator;
import java.util.LinkedList;

public class ListaDeNinjas<T> {
    private LinkedList<T> listaDeNinjas;

    public ListaDeNinjas(){
        this.listaDeNinjas = new LinkedList<>();
    }

    public void adicionarNinja(T ninja){
        listaDeNinjas.add(ninja);
    }

    public void removerNinja(T ninja){
        listaDeNinjas.remove(ninja);
    }

    public void exibirLista(){
        System.out.println("------------------------ Lista de Ninjas ------------------------");
        for (T ninja: listaDeNinjas){
            System.out.println(ninja);
        }
        System.out.println("------------------------------------------------------------------");
    }

    public void ordenarPorNome(){
        listaDeNinjas.sort(Comparator.comparing(ninja ->((Ninja) ninja).getNome()));
        System.out.println("Lista ordenada por nome: ");
        exibirLista();
    }

    public void ordenarPorAldeia(){
        listaDeNinjas.sort(Comparator.comparing(ninja ->((Ninja) ninja).getAldeia()));
        System.out.println("Lista ordenada por aldeia: ");
        exibirLista();
    }

    public void ordenarPorIdade(){
        listaDeNinjas.sort(Comparator.comparingInt(ninja ->((Ninja) ninja).getIdade()));
        System.out.println("Lista ordenada por idade: ");
        exibirLista();
    }

    public T buscarNinjaPorNome(String nome) {
        for (T ninja : listaDeNinjas) {
            if (((Ninja) ninja).getNome().toLowerCase().contains(nome.toLowerCase())) {
                return ninja;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return listaDeNinjas.toString();
    }
}
