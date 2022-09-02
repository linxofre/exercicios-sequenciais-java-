package exercicio1;

import java.util.Scanner;

public class Exerc6 {

	public static void main(String[] args) {
		/*6. Faça um Programa que peça o raio de um 
		 * círculo, calcule e mostre sua área. */
			
		Scanner entrada = new Scanner(System.in);
		System.out.print("digite o raio: ");
		double r = entrada.nextInt();
		final double pi = 3.14;
		entrada.close();
		System.out.println("a área desse círculo é: "+ pi*(r*r));
	}

}
