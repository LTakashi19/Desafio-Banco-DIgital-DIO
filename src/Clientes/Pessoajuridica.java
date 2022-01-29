package Clientes;

public class Pessoajuridica extends Cliente{

    private final String CNPJ;



    public Pessoajuridica(String nome, String cnpj) {
        super(nome);
        this.CNPJ= cnpj;
    }



    public String getCNPJ() {
        return CNPJ;
    }
}
