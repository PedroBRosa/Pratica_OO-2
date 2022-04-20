package LojaComercial;

public class Administrado extends Funcionario{
    double salarioFixo;
    int horaAdicional;

    public Administrado(String nome, String rg, double salarioFixo) {
        super(nome, rg);
        this.salarioFixo = salarioFixo;
    }
    public void horas(int horaAdicional){
        this.horaAdicional = horaAdicional;
        horaAdicional+=horaAdicional;
    }
    public double salarioTotal(){

    }
}
