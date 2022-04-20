package ContaInteface;

public interface Conta {
    void deposita(double valor);

    void sacar(double valor);

    double getSaldo();
}
