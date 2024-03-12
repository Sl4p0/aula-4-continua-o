package app;

import model.ContaCorrente;
import model.ContaPoupanca;
import view.Mensagens;

public class usuarioview {
	Mensagens mensagem = new Mensagens ();
	
public void InterfaceDoUsuario () {
	int Opcao;
	String OpcaoSelecionada;
	
	OpcaoSelecionada = mensagem.solicitarEntrada(
	 "selecione uma opção"
	+ "\n1- criar conta"
	+ "\n2- fazer saque"
	+	"\n3- verificar saldo");
	
	Opcao = Integer.parseInt(OpcaoSelecionada);
	switch (Opcao) {
	case 1:
		String tipodeConta;
		tipodeConta = mensagem.solicitarEntrada(
			"Qual tipo de conta você deseja?"
			+ "\n1- Conta Poupança"
			+ "\n2- Conta Corrente");
		
		String EmailUsuario;
		
		EmailUsuario = mensagem
				.solicitarEntrada ("Digite o seu email");
		
		if (tipodeConta.equals("1")) {
			ContaPoupanca conta = new ContaPoupanca (EmailUsuario);
		
		if (tipodeConta.equals("2")) {
			ContaCorrente conta = new ContaCorrente (EmailUsuario, 2); 
				
		}
		
	break;
	
	case 2:
		break;
	}
}
}
