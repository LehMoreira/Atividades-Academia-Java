package sef.module3.sample;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class JogoDaVelha {
	
		
	public static void main(String[] args) {
		String[][] tabuleiro = { 
						{" "," "," "},
						{" "," "," "},
						{" "," "," "}};
		boolean jogando = true;
		//Scanner input = new Scanner(System.in);
		//System.out.println("Olá jogadores!");
		JOptionPane.showMessageDialog(null, "Olá jogadores! ");
		//System.out.println("Jogador 1 decida qual letra você quer que te represente");
		String jogador1 = JOptionPane.showInputDialog("Jogador 1 decida qual letra você quer que te represente");
		//System.out.println("Jogador 2 decida qual letra você quer que te represente");
		String jogador2 = JOptionPane.showInputDialog("Jogador 2 decida qual letra você quer que te represente");
		String jogador = jogador1;
		while (jogando) {
			imprimirTabuleiro(tabuleiro);
			//System.out.println(jogador +" digite em qual posição(linha e coluna) você quer jogar");
			String etdLinha = JOptionPane.showInputDialog(jogador+ " digite em qual linha você quer jogar");
			String etdColuna = JOptionPane.showInputDialog(jogador+ " digite em qual coluna você quer jogar");
			int linha1 = Integer.parseInt(etdLinha);		
			int coluna1 = Integer.parseInt(etdColuna);
			if (linha1 >= 0 && linha1 < 3 && coluna1 >= 0 && coluna1 < 3 && tabuleiro[linha1][coluna1].equals(" ")) {
                tabuleiro[linha1][coluna1] = jogador;
                if (verificarVencedor(tabuleiro, jogador)) {
                    imprimirTabuleiro(tabuleiro);
                    //System.out.println("Jogador " + jogador + " venceu!");
                    JOptionPane.showMessageDialog(null, "Parabéns jogador " + jogador + " \nvocê ganhou!" );
                    jogando = false;
                } else if (tabuleiroCheio(tabuleiro)) {
                    imprimirTabuleiro(tabuleiro);
                    //System.out.println("Ops! Deu velha :)");
                    JOptionPane.showMessageDialog(null, "Ops, deu velha!" );
                    jogando = false;
                } else {
                    jogador = (jogador.equals(jogador1)) ? jogador2 : jogador1;
                }
            } else {
                //System.out.println("Movimento inválido. Tente novamente.");
            	JOptionPane.showMessageDialog(null, "Movimento Inválido. Tente novamente",jogador, JOptionPane.ERROR_MESSAGE );
            }
        }
       // input.close();
			}
	// impressao do tabuleiro
	public static void imprimirTabuleiro(String[][] tabuleiro) {
		do {		
			System.out.print("\n\n 0   1    2\n\n");
			for (int linha = 0; linha < 3; linha++) {
				for (int coluna = 0; coluna < 3; coluna++) {
					System.out.print(" " + tabuleiro[linha][coluna]);
					if (coluna < 2) {
						System.out.print(" | ");
					}
					if (coluna == 2) {
						System.out.print("  " + linha);
					}
				}
				if (linha < 2) {
					System.out.print("\n------------");
				}
				System.out.println("\n");
			}
		} while (false);
	}
	public static boolean verificarVencedor(String[][] tabuleiro, String jogador) {
        // Verificar linhas
        for (int linha2 = 0; linha2 < 3; linha2++) {
            if (tabuleiro[linha2][0].equals(jogador) && tabuleiro[linha2][1].equals(jogador) && tabuleiro[linha2][2].equals(jogador)) {
                return true;
            }
        }
        // Verificar colunas
        for (int coluna2 = 0; coluna2 < 3; coluna2++) {
            if (tabuleiro[0][coluna2].equals(jogador) && tabuleiro[1][coluna2].equals(jogador) && tabuleiro[2][coluna2].equals(jogador)) {
                return true;
            }
        }
        // Verificar diagonais
        if (tabuleiro[0][0].equals(jogador) && tabuleiro[1][1].equals(jogador) && tabuleiro[2][2].equals(jogador)) {
            return true;
        }
        if (tabuleiro[0][2].equals(jogador) && tabuleiro[1][1].equals(jogador) && tabuleiro[2][0].equals(jogador)) {
            return true;
        }
        return false;
    }

    public static boolean tabuleiroCheio(String[][] tabuleiro) {
        for (int linha3 = 0; linha3 < 3; linha3++) {
            for (int coluna3 = 0; coluna3 < 3; coluna3++) {
                if (tabuleiro[linha3][coluna3].equals(" ")) {
                    return false;
                }
            }
        }
        return true;
    }
}
