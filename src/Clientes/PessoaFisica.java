package Clientes;

public class PessoaFisica extends Cliente{

    private final String cpf;

    public PessoaFisica(String nome, String cpf) {
        super(nome);
        this.cpf=cpf;

    }

    public String getCpf() {
        return this.cpf;
    }
}
