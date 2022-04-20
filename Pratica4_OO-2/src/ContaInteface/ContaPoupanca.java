package ContaInteface;

public class ContaPoupanca implements Conta{
    public double saldo;

    @Override
    public void deposita(double valor) {
        this.saldo+=valor;
    }

    @Override
    public void sacar(double valor) {
        this.saldo-=valor;
    }

    @Override
    public double getSaldo() {
        return this.saldo;
    }
}
