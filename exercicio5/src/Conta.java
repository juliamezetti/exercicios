public class Conta {

    int numero;
    float saldo;
    float limite;
    Cliente titular;

    void deposita(float quantia) {
        saldo += quantia;
    }

    void saca(float quantia) {
        float novoSaldo = saldo - quantia;
        saldo = novoSaldo;
    }

    void transferir(Conta contaDestino, float quantia) {
        saldo -= quantia;
        contaDestino.saldo += quantia;
    }

}