package sef.module3.sample;

import java.util.Scanner;
//Atividade 1 - Scanners
public class VendasBilheteria {
	public static void main(String[] args) {
		double ClasseA = 50.00;
		double ClasseB = 30.00;
		double ClasseC = 20.00;
        Scanner input = new Scanner(System.in);
        
        //entrada do usuario referente a qntd d bilhetes
        System.out.println("Quantos bilhetes da classe A foram vendidos? ");
        int qtdClasseA = input.nextInt(); 
        System.out.println("Quantos bilhetes da classe B foram vendidos? ");
        int qtdClasseB = input.nextInt(); 
        System.out.println("Quantos bilhetes da classe C foram vendidos? ");
        int qtdClasseC = input.nextInt(); 
        //calculando quanto cada classe faturou
        double resultadoA = qtdClasseA * ClasseA;
        double resultadoB = qtdClasseB * ClasseB;
        double resultadoC = qtdClasseC * ClasseC;
        //faturamento
        double faturamento = resultadoA + resultadoB + resultadoC;
        System.out.println("O faturamento da venda dos ingressos foi de R$ " + faturamento);
        

        
    }

}
