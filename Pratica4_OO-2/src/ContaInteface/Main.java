package ContaInteface;

public class Main {
    public static void main(String[] args) {

    ContaCorrente cc = new ContaCorrente();
    cc.deposita(1200.00);
    cc.sacar(25);

    ContaPoupanca cp = new ContaPoupanca();
    cp.deposita(500.50);
    cp.sacar(25);

    GeradorExtratos gerador = new GeradorExtratos();
    gerador.geradorConta(cc);
    gerador.geradorConta(cp);

    }
}
