package Tipo_Contas;

import Clientes.Cliente;

import java.util.GregorianCalendar;

public class ContaPoupanca extends Conta {

    GregorianCalendar calendar = new GregorianCalendar();

    private final int diaJuros;
    private double taxaJuros = 0.03;

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
        diaJuros= calendar.get(GregorianCalendar.DAY_OF_MONTH);
    }


    public double getTaxaJuros() {
        return taxaJuros;
    }




    public void setTaxaJuros(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }


    //calcula o rendimento mensal da conta
    public void adicionaJuros(double taxa){
        if(calendar.get(GregorianCalendar.DAY_OF_MONTH) == diaJuros) {
            this.saldoConta += this.saldoConta * taxa;
            System.out.println("\nRendimento mensal adicionado.\nSaldo atual: " + this.saldoConta);
        }else {
            System.out.println("\nNada a adicionar");
        }
    }
}
