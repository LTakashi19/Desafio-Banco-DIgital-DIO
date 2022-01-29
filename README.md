# Desafio-Banco-Digital-DIO
Esse repositório é exclusivo para o projeto do banco digital 


Mudanças realizadas:

Banco - Adicionado um array para guardas todas as contas criadas
	Adicionado um metodo que imprime todas as contas dentro do array, informando numero, cliente e saldo;

Conta - Adcionado um objeto cliente
	Reformulação do metodo getCliente para retornar o nome do cliente ao inves do numero de referencia
	Adicionado setAgencia, possibilitando a troca de agencia pelo cliente
	Adicionado verificaValor, possibilitando checar se o valor de uma operação excede o saldo total da conta

ContaPoupanca - Adicionado diaJuros, possibilitando adicionar juros a cada mês
		Adicionado taxaJuros, possibilitando guardar a taxa de rendimento da conta
		Modificado o construct para guardar o dia da criação como o diaJuros
		Adicionado get e set da taxa de juros para mostras a taxa, os metodos e modifica-la com base na taxa SELIC
		Adicionado metodo adicionaJuros, o qual verifica se o dia atual é igual ao diaJuros e adiciona juros se positivo

Cliente - 	Adicionado dois arrays para manter as contas de cada cliente, e suas formas de contato
		Adicionado adicionaConta e adicionaContato, para preencher os arrays
		Adicionado imprimeInformacoes que imprime todos os valores dos arrays
		Adicionado trocarAgencia, permitindo a troca de agencia pelo cliente

- adicionado PessoaFisica: adicionado CPF
- adicionado PessoaJuridica: adicionado CNPJ