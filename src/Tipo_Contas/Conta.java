package Tipo_Contas;

import Clientes.Cliente;

public abstract class Conta {

    private static int contadorConta= 1; //calcular o numero da conta
    private final int numeroConta; // numero de indentificação da conta dentro do sistema
    private int numeroAgencia= 1; //Agencia padrão
    protected double saldoConta; //Guarda o total do dinheiro dentro da conta
    protected final Cliente cliente; //Indentificação de qual cliente a conta pertence

//--------------------- CONSTRUTOR ------------------------

    public Conta(Cliente cliente){
        this.numeroConta= contadorConta++; //Utiliza o contador para definir o numero da conta e o incrmenta
        this.cliente= cliente;
        this.saldoConta=0;
    }


//--------------------- GETTERS ---------------------------

    public double getSaldoConta() {
        return this.saldoConta;
    }

    public int getNumeroAgencia() {
        return numeroAgencia;
    }

    public int getNumeroConta() {
        return this.numeroConta;
    }

    public String getCliente() {
        return cliente.getNome();
    }


//--------------------- SETTERS -----------------------------

    //Possibilita o cliente trocar de agencia
    public void setNumeroAgencia(int numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }


//----------------------- METODOS ---------------------------

    //Deposita valor na conta  exibe o saldo apos o deposito
    public void deposito(double valor){
        this.saldoConta += valor;
        System.out.println("\nDeposito realizado com sucesso. \nSaldo atual:" + this.saldoConta);
    }

    //Verifica se o valor é maior do que o saldo na conta
    public boolean verificaValor(double valor){
        if(valor>this.saldoConta){
            System.out.println("\nSaldo invalido.\nSaldo: "+this.saldoConta);
            return false;
        }
        return true;
    }

    //Saca um valor especificado da conta
    public void saque(double valor){
        if(verificaValor(valor)) this.saldoConta -= valor;
    }

    //Transfere uma quantia de uma conta para outra
    public void transferencia(Conta destino, double valor){
        if(verificaValor(valor)){
            this.saldoConta -= valor;
            destino.deposito(valor);
            System.out.println("\nTransferencia realizada com sucesso.\nSaldo atual: " + this.saldoConta);
        }
    }
}


