package LojaComercial;

public class Vendedor extends Funcionario{
    double valorVenda=0,salarioBase,comissao=5.0;

    public Vendedor(String nome, String rg, double salarioBase) {
        super(nome, rg);
        this.salarioBase = salarioBase;
    }

    public void vendas(double valorVenda){
        this.valorVenda = valorVenda;
        valorVenda+=valorVenda;
    }

    public double salarioTotal(){
        double comissaoVendas;
        comissao=comissao/100;
        comissaoVendas=valorVenda*comissao;
        valorVenda=0;
        return salarioBase+comissaoVendas;
    }

}
