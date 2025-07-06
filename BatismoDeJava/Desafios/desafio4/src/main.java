public class main {
    public static void main(String[] args) {

        NinjaBasico ninjab1 = new NinjaBasico("Iruka", 32, "Shuriken Gigante");
        ninjab1.tipoHabilidade = TipoHabilidade.TAIJUTSU;
        ninjab1.mostrarInformacoes();
        ninjab1.executarHabilidade();

        NinjaAvancado ninjaa1 = new NinjaAvancado("Deidara", 21,
                "Argila Explosiva", "Destruição");
        ninjaa1.tipoHabilidade = TipoHabilidade.NINJUTSU;
        ninjaa1.mostrarInformacoes();
        ninjaa1.executarHabilidade();

    }
}
