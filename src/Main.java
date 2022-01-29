import Clientes.*; //importa todas as classes do pacote clientes
import Tipo_Contas.*; //importa todas as classes do pacote contas

public class Main {
    public static void main(String[] args) {

        Cliente Jonas= new PessoaFisica("Jonas", "12345678900");
        Conta conta1= new ContaCorrente(Jonas);
        Banco.adicionaConta(conta1,Jonas);
        Jonas.adicionaContato("jonas@gmail.com");
        Jonas.adicionaContato("(11) 99999-0000");

        Cliente Gilson_Vidros= new Pessoajuridica("Vidracaria Gilson", "12345678901234");
        Conta conta2= new ContaCorrente(Gilson_Vidros);
        Banco.adicionaConta(conta2,Gilson_Vidros);
        Gilson_Vidros.adicionaContato("gilson@gilsonvidros.com.br");
        Gilson_Vidros.adicionaContato((11)3333-3333);

        ContaPoupanca conta3= new ContaPoupanca(Jonas);
        Banco.adicionaConta(conta3,Jonas);

        //Deposita valores naa contas
        conta1.deposito(500);
        conta2.deposito(10000);

        //Faz tranferencia entre contas
        conta2.transferencia(conta1,200);
        conta1.transferencia(conta3,300);

        //Saca os valores
        conta1.saque(200);
        conta1.saque(500);

        //Adiciona o rendimento mensal a conta poupança
        conta3.adicionaJuros(0.03);

        //Imprime as infomações dos clientes
        Jonas.imprimeInformacoes();
        Gilson_Vidros.imprimeInformacoes();

        //Imprime as informações das contas dos bancos
        Banco.imprimeInfoContas();
    }

}
