package exercicio1;

import java.util.Scanner;

public class Exerc6 {

	public static void main(String[] args) {
		/*6. Fa�a um Programa que pe�a o raio de um 
		 * c�rculo, calcule e mostre sua �rea. */
			
		Scanner entrada = new Scanner(System.in);
		System.out.print("digite o raio: ");
		double r = entrada.nextInt();
		final double pi = 3.14;
		entrada.close();
		System.out.println("a �rea desse c�rculo �: "+ pi*(r*r));
	}

}
