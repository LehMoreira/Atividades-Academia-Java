package sef.module4.sample;

import javax.swing.JOptionPane;

public class Retangulo {
		double lado1;
		double lado2;
		double area;
		double perimetro;
	public static void main(String[] args) {
        Retangulo novoRetangulo = new Retangulo(10, 5);
        
        // Calcula a área e o perímetro
        novoRetangulo.calcularArea();
        novoRetangulo.calcularPerimetro();
        
        JOptionPane.showMessageDialog( null, "Retangulo 1:\n Area: " + novoRetangulo.area + "\nPerimetro " + novoRetangulo.perimetro);
        // Modifica o valor de lado2 e recalcula a area e o perimetro e exibe o resultado
        novoRetangulo.lado2 = 7;
        novoRetangulo.calcularArea();
        novoRetangulo.calcularPerimetro();

        JOptionPane.showMessageDialog(null, "Retangulo Atualizado:\n" + "Área: " + novoRetangulo.area + "\nPerímetro: " + novoRetangulo.perimetro);
        
        // Cria e configura 5 novos retângulos com valores fornecidos pelo usuário e exibe o resultado
        Retangulo[] novosRetangulos = new Retangulo[5];
        StringBuilder resultado = new StringBuilder();

        for (int contador = 0; contador < novosRetangulos.length; contador++) {
            String etLado1 = JOptionPane.showInputDialog("Digite o valor do lado1 para o Retangulo " + (contador + 1) + ":");
            double lado1 = Double.parseDouble(etLado1);

            String etLado2 = JOptionPane.showInputDialog("Digite o valor do lado2 para o Retangulo " + (contador + 1) + ":");
            double lado2 = Double.parseDouble(etLado2);

            novosRetangulos[contador] = new Retangulo(lado1, lado2);
            novosRetangulos[contador].calcularArea();
            novosRetangulos[contador].calcularPerimetro();
            
            resultado.append(String.format("Retangulo %d:\nArea: %.2f\nPerimetro: %.2f\n\n", 
            		contador + 1, novosRetangulos[contador].area, novosRetangulos[contador].perimetro));
            JOptionPane.showMessageDialog(null, resultado.toString());
        }
	}
	public Retangulo() {}
	public Retangulo(double lado1, double lado2) {
		this.lado1 = lado1;
		this.lado2 = lado2;
		
	}

	public void calcularArea () {
		this.area = this.lado1*this.lado2;
	}
	public void calcularPerimetro () {
		this.perimetro = 2*this.lado1 + 2*this.lado2;
	}

	
	
	

}
