package sef.module3.sample;

import java.util.Scanner;

//Fa�a um programa para pesquisar o valor 8 no vetor dado:
//inteiro vetor[] = {1, 3, 5, 8, 9, 10}
public class LocalizaNumero {
	// Corrigir este algoritmo.
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int vetor[] = {1,2,3,4,5,6,7,8,9,10};
		boolean achou = false;
		int i =0;
		System.out.println("De 1 a 10 digite um numero que você quer saber a posição");
		int numero = input.nextInt();
		for (i=0; i<10; i++) {
			if (vetor[i] == numero){
				achou = true;
				break;
		    }
		}
		if (achou) {
	        System.out.println("Achei");
	        System.out.printf("Na Posi��o %d est� localizado do numero %d.", i, vetor[i]);			
		}
	}

}
