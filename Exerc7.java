package exercicio1;

import java.util.Scanner;

public class Exerc7 {

	public static void main(String[] args) {
		/*7. Fa�a um Programa que calcule e 
		 *   mostre a �rea de um quadrado. */
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("digite o raio: ");
		double l = entrada.nextInt();
		
		entrada.close();
		System.out.println("a �rea desse quadrado �: "+ l*l);
	}

}
