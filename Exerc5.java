package exercicio1;

import java.util.Scanner;

public class Exerc5 {

	public static void main(String[] args) {
		/*5. Fa�a um Programa que converta metros 
		 *   para cent�metros. */
		Scanner entrada = new Scanner(System.in);
		System.out.print("digite a dist�ncia (em metros): ");
		double m = entrada.nextInt();
		
		entrada.close();
		System.out.print("em metros: "+ m + ", em cent�metros: " + m * 100);
	}

}
