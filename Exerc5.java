package exercicio1;

import java.util.Scanner;

public class Exerc5 {

	public static void main(String[] args) {
		/*5. Faça um Programa que converta metros 
		 *   para centímetros. */
		Scanner entrada = new Scanner(System.in);
		System.out.print("digite a distância (em metros): ");
		double m = entrada.nextInt();
		
		entrada.close();
		System.out.print("em metros: "+ m + ", em centímetros: " + m * 100);
	}

}
