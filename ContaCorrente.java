package sef.module4.activity;

import java.time.LocalDate;
import javax.swing.JOptionPane;

public class ContaCorrente {
	private int numero;
	private Cliente nome;
	double saldo;
	private LocalDate data;
	
	public ContaCorrente(int numero, Cliente nome, double saldo) {
		this.numero = numero;
		this.nome = nome;
		this.saldo = saldo;
		this.data = LocalDate.now();;
	}
	public void depositar(double valor) {
		saldo+=valor;
		JOptionPane.showMessageDialog( null, "Deposito de R$ " +valor+ " realizado com sucesso!" );
	}
	public boolean sacar(double valor) {
		double retirar =0;
		if(saldo >= valor) {
			saldo-=valor;
			JOptionPane.showMessageDialog( null, "Saque de R$ "+valor+" realizado com sucesso!");
			return true;
		}else {
			JOptionPane.showMessageDialog( null, "Saldo insuficiente" );
			return false;
		}
			
	}
	public void exibirExtrato() {
		JOptionPane.showMessageDialog( null, numero+" seu saldo atual é R$ " +saldo );
		
	}
	public boolean transferir (ContaCorrente contaDestino, double valor) {
		 if (saldo >=valor) {
	            contaDestino.saldo +=valor;
	            saldo-=valor;
	            JOptionPane.showMessageDialog( null, "Transferencia de R$" + valor + " realizada para a conta de " + contaDestino.numero );
	            return true;
	        } else {
	        	JOptionPane.showMessageDialog( null, "Saldo insuficiente! \nA operação foi cancelada");
	            return false;
	        }
		
	}

}
