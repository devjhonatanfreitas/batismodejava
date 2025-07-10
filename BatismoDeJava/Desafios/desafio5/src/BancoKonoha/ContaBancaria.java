package BancoKonoha;

public abstract class ContaBancaria implements Conta {

    double saldo;
    int conta;
    TipoConta tipo;

    @Override
    public void consultaSaldo() {
        System.out.println("-------------------------------------");
        System.out.println("Seu saldo atual é: "+saldo);
        System.out.println("-------------------------------------");
    }

    public ContaBancaria(double saldo, int conta, TipoConta tipo) {
        this.saldo = saldo;
        this.conta = conta;
        this.tipo = tipo;
    }

    @Override
    public void creditar(double valor) {
        saldo = saldo + valor;
        System.out.println("-------------------------------------");
        System.out.println("Crédito recebido no valor de: "+valor);
        System.out.println("Novo saldo: "+saldo);
        System.out.println("-------------------------------------");
    }

    @Override
    public void debitar(double valor) {
        saldo = saldo - valor;
        System.out.println("-------------------------------------");
        System.out.println("Débito realizado no valor de: "+valor);
        System.out.println("Novo saldo: "+saldo);
        System.out.println("-------------------------------------");
    }

    @Override
    public void transferir(ContaBancaria contaDestino, double valor) {
        this.debitar(valor);
        contaDestino.creditar(valor);
        System.out.println("-------------------------------------");
        System.out.println("Transferência no valor de "+valor+" realizada para a conta "+contaDestino.tipo);
        System.out.println("Saldo atual: "+saldo);
        System.out.println("-------------------------------------");
    }

    @Override
    public void mostraInformacoes() {
        System.out.println("-------------------------------------");
        System.out.println("Número da conta: "+conta);
        System.out.println("Tipo de conta: "+tipo);
        System.out.println("Saldo atual: "+saldo);
        System.out.println("-------------------------------------");
    }
}
