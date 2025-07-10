package BancoKonoha;

public class ContaPoupanca extends ContaBancaria{

    public ContaPoupanca(double saldo, int conta, TipoConta tipo) {
        super(saldo, conta, tipo);
    }

    @Override
    public void depositar(double valor) {

        double taxa = valor * 0.01;
        saldo = saldo + (valor - taxa);
        System.out.println("---------------------------------------------------------------");
        System.out.println("Depósito no valor de " +valor+ " recebido, novo saldo: "+saldo);
        System.out.println("Taxa debitada no valor de "+taxa);
        System.out.println("---------------------------------------------------------------");

    }
}
