package BancoKonoha;

public interface Conta {

    void consultaSaldo();
    void depositar(double valor);
    void debitar(double valor);
    void creditar(double valor);
    void transferir(ContaBancaria contaDestino, double valor);
    void mostraInformacoes();

}
