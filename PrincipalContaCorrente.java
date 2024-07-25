package sef.module4.activity;

import javax.swing.JOptionPane;

public class PrincipalContaCorrente {
	public static void main(String[] args) {
		Cliente cliente1 = new Cliente("Maria","15489825517","Silva");
		ContaCorrente conta1 = new ContaCorrente(0, cliente1 ,50.0);
		Cliente cliente2 = new Cliente("Joao", "52369874214","Silva");
		ContaCorrente conta2 = new ContaCorrente(1, cliente2, 100.0);
		conta1.exibirExtrato();
		String input = JOptionPane.showInputDialog("Quanto você quer depositar na conta 0?");
		double valor = Double.parseDouble(input);
		conta1.depositar(valor);
		conta1.exibirExtrato();
		String input1 = JOptionPane.showInputDialog("Quanto você quer sacar na conta 0?");
		double valor1 = Double.parseDouble(input1);
		conta1.sacar(valor1);
		conta1.exibirExtrato();
		conta2.exibirExtrato();
		String input2 = JOptionPane.showInputDialog("Quanto você quer transferir da conta 0 para a conta 1?");
		double valor2 = Double.parseDouble(input2);
		conta1.transferir(conta2, valor2);
		conta1.exibirExtrato();
		conta2.exibirExtrato();
		
	}

}
