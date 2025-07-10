package BancoKonoha;

public class ContaCorrente extends ContaBancaria{

    public ContaCorrente(double saldo, int conta, TipoConta tipo) {
        super(saldo, conta, tipo);
    }

    @Override
    public void depositar(double valor) {

        saldo = saldo + valor;
        System.out.println("---------------------------------------------------------------");
        System.out.println("Depósito no valor de " +valor+ " recebido, novo saldo: "+saldo);
        System.out.println("---------------------------------------------------------------");

    }
}
