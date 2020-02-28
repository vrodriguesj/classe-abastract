package main;

import java.util.Locale;

import model.entities.AbstratoShape;
import model.entities.Color;
import model.entities.Quadrado;

public class Program {

	public static void main(String args[]) {
		
		Locale.setDefault(Locale.US);

		AbstratoShape a1 = new Quadrado(Color.BRANCO, 2.0, 5.0);
		
		System.out.println("Cor: " + a1.getColor());
		System.out.println("Resultado Quadrado: " + String.format("%.2f", a1.area()));
	}
}
