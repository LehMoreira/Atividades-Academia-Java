package sef.module4.sample;

import javax.swing.JOptionPane;

public class Circulo {
	double raio;
	double area;
	double perimetro;
	double pi = 3.14;
	public static void main(String[] args) {
		Circulo novoCirculo = new Circulo(10);
		novoCirculo.calcularArea();
		JOptionPane.showMessageDialog( null, "Circulo 1:\n Area: " + novoCirculo.area);
		novoCirculo.calcularPerimetro();
		JOptionPane.showMessageDialog( null, "Circulo 1:\n Perimetro: " + novoCirculo.perimetro);
		novoCirculo.raio = 4;
		novoCirculo.calcularArea();
		JOptionPane.showMessageDialog( null, "Circulo 1:\n Area: " + novoCirculo.area);
		novoCirculo.calcularPerimetro();
		JOptionPane.showMessageDialog( null, "Circulo 1:\n Perimetro: " + novoCirculo.perimetro);
		
		Circulo[] novosCirculos = new Circulo[5];
		StringBuilder resultados = new StringBuilder();
		for (int contador =0; contador<novosCirculos.length; contador++) {
			String etRaio = JOptionPane.showInputDialog("Digite o valor do lado1 para o Retangulo " + (contador + 1) + ":");
            double raio = Double.parseDouble(etRaio);
            
            novosCirculos[contador] = new Circulo(raio);
            novosCirculos[contador].calcularArea();
            novosCirculos[contador].calcularPerimetro();
            
            resultados.append(String.format("Retangulo %d:\nArea: %.2f\nPerimetro: %.2f\n\n", 
            		contador + 1, novosCirculos[contador].area, novosCirculos[contador].perimetro));
            JOptionPane.showMessageDialog(null, resultados.toString());
		}
	}
	public Circulo() {}
	public Circulo(double raio) {
		this.raio = raio;
	}
	public void calcularArea() {
		this.area= this.raio*this.raio*pi;
	}
	public void calcularPerimetro() {
		this.perimetro = 2*pi*this.raio;
	}
}
