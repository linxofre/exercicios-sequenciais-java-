package exercicio1;

import java.util.Scanner;

public class Exerc8 {

	public static void main(String[] args) {
		/*8. Faça um Programa que pergunte 
		 * quanto você ganha por hora e o 
		 * número de horas trabalhadas no mês.
		 * Calcule e mostre o total do seu 
		 * salário no referido mês. */

		Scanner entrada = new Scanner(System.in);
		System.out.print("digite quanto ganha por hora: ");
		double salario = entrada.nextInt();
		System.out.print("digite quantas horas foram trabalhadas: ");
		double horas = entrada.nextInt();
		
		entrada.close();
		System.out.print("salário bruto: " + salario * horas);
	}

}
