package exercicio1;

import java.util.Scanner;

public class Exerc8 {

	public static void main(String[] args) {
		/*8. Fa�a um Programa que pergunte 
		 * quanto voc� ganha por hora e o 
		 * n�mero de horas trabalhadas no m�s.
		 * Calcule e mostre o total do seu 
		 * sal�rio no referido m�s. */

		Scanner entrada = new Scanner(System.in);
		System.out.print("digite quanto ganha por hora: ");
		double salario = entrada.nextInt();
		System.out.print("digite quantas horas foram trabalhadas: ");
		double horas = entrada.nextInt();
		
		entrada.close();
		System.out.print("sal�rio bruto: " + salario * horas);
	}

}
