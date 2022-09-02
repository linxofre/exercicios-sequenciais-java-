package exercicio1;

import java.util.Scanner;

public class Exerc9 {

	public static void main(String[] args) {
		/*9. Faça um Programa que peça a 
		 * temperatura em graus Farenheit, 
		 * transforme e mostre a temperatura 
		 * em graus Celsius.
			 C=(5*(F-32)/9) ou C=(F–32)/1,8	 */
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("digite os graus em Farenheit: ");
		double f = entrada.nextInt();
		
		double c = (5*(f-32)/9);
		
		entrada.close();
		System.out.print("Em graus Celsius é: " + c);
	}

}
