package sef.module3.sample;

import java.util.Scanner;

public class ChessBoard {
	public static void main(String[] args) {
		
		String[][] board = { 
				{"R","N","B","Q","K","B","N","R"},
				{"P","P","P","P","P","P","P","P"},
				{" "," "," "," "," "," "," "," "},
				{" "," "," "," "," "," "," "," "},
				{" "," "," "," "," "," "," "," "},
				{" "," "," "," "," "," "," "," "},
				{"p","p","p","p","p","p","p","p"},
				{"r","n","b","q","k","b","n","r"}};
		Scanner input = new Scanner(System.in);
		boolean jogando = true;

		 for (int i = 0; i < board.length; i++) {
		        for (int j = 0; j < board[i].length; j++) {
		        	System.out.print(board[i][j]+"  ");
		        }
		        System.out.println("");
		    }
		 
		 //Mover Cavalo
		 System.out.println("");
		 board[5][5] = board[7][6];
		 board[7][6] = "";

		 for (int i = 0; i < board.length; i++) {
		        for (int j = 0; j < board[i].length; j++) {
		        	System.out.print(board[i][j]+"  ");
		        }
		        System.out.println("");
		    }
		 
		 // Mover Peao
		 while(jogando) {
		 System.out.println("");
		 System.out.println("Digite qual a posição(linha,coluna) do peao que você quer mover : ");
		 int linha = input.nextInt();
		 int coluna = input.nextInt();
		 System.out.println("Digite qual a posição(linha,coluna) do peao que você quer mover : ");
		 int linha1 = input.nextInt();
		 int coluna1 = input.nextInt();
		 //validando se o peao será movido para uma casa que esteja vazia e se será apenas para frente, seguindo as regras de negocio
		 if (linha < board.length && coluna < board[linha].length && linha1 < board.length && coluna1 ==coluna && 
			board[linha][coluna].equals("p") ||board[linha][coluna].equals("P")  && board[linha1][coluna1].equals(" ")) {
			 
     		board[linha1][coluna1] = board[linha][coluna];
     		board[linha][coluna] = " ";
     		imprimirBoard(board);
     	}else {
     		System.out.println("Movimento inválido,tente novamente");
     	}
		}
		// board[4][2] = board[6][2];
		// board[6][2] = " ";
		 for ( int i = 0; i < board.length; i++) {
		        for ( int j = 0; j < board[i].length; j++) {
		        	
		        	System.out.print(board[i][j]+"  ");
		        }
		        System.out.println("");
		    }
		 //imprimirBoard(board);
	}
	
	// --------------Impress�o do Tabuleiro---------------------------------------
	public static void imprimirBoard(String[][] board) {
		 for (int i = 0; i < board.length; i++) {
		        for (int j = 0; j < board[i].length; j++) {
		        	System.out.print(board[i][j]+"  ");
		        }
		        System.out.println("");
		    }
	}
}
