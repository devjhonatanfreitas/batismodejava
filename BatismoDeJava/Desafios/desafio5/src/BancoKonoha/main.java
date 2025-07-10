package BancoKonoha;

public class main {
    public static void main(String[] args) {

        ContaCorrente cc1 = new ContaCorrente(500, 4321, TipoConta.CORRENTE);

        ContaPoupanca cp1 = new ContaPoupanca(5000, 1234, TipoConta.POUPANCA);

        cc1.mostraInformacoes();
        cp1.mostraInformacoes();

        cc1.depositar(1000);
        cp1.depositar(1000);

        cc1.consultaSaldo();
        cp1.consultaSaldo();

        cc1.creditar(500);
        cp1.creditar(500);

        cc1.debitar(500);
        cp1.debitar(500);

        cc1.transferir(cp1,1000);
        cp1.consultaSaldo();

    }
}
