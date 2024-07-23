package sef.module3.sample;
//Fa�a um programa para pesquisar o valor 8 no vetor dado:
//inteiro vetor[] = {1, 3, 5, 8, 9, 10}
public class LocalizaNumero {
	// Corrigir este algoritmo.
	public static void main(String[] args) {
		int vetor[] = {1,2,3,4,5,6,7,8,9,10};
		boolean achou = false;
		int i =0;
		for (i=0; i<10; i++) {
			if (vetor[i] == 8){
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
