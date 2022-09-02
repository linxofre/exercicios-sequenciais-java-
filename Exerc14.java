package exercicio1;

import java.util.Scanner;

public class Exerc14 {

	public static void main(String[] args) {
/*14.Fa�a um Programa que pergunte quanto 
 * voc� ganha por hora e o n�mero de horas
 * trabalhadas no m�s. Calcule e mostre o 
 * total do seu sal�rio no referido m�s, 
 * sabendo-se que s�o descontados 11% para 
 * o Imposto de Renda, 8% para o INSS e 
 * 5% para o sindicato, fa�a um programa 
 * que nos d�:
 * 
a. sal�rio bruto.
b. quanto pagou ao INSS.
c. quanto pagou ao sindicato.
d. o sal�rio l�quido.
e. calcule os descontos e o sal�rio l�quido, conforme a tabela abaixo:
f. + Sal�rio Bruto : R$
g. - IR (11%) : R$
h. - INSS (8%) : R$
i. - Sindicato ( 5%) : R$
j. = Sal�rio Liquido : R$
Obs.: Sal�rio Bruto - Descontos = Sal�rio L�quido.

* 
*/		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe quanto ganha por hora: ");
		double salario = entrada.nextDouble();
		System.out.print("Informe a quantidade de horas trabalhadas: ");
		double horas = entrada.nextDouble();
		
		double bruto = (salario * horas);
		double ir = ((11 * bruto)/100);
		double inss = ((8 * bruto)/100);
		double sindicato = ((5 * bruto)/100);
		double liquido = (bruto - ir - inss - sindicato);
		
		entrada.close();
		System.out.println("\n sal�rio bruto: " + bruto);
		System.out.println("\n imposto de renda: " + ir);
		System.out.println("\n INSS: " + inss);
		System.out.println("\n sindicato: " + sindicato);
		System.out.println("\n sal�rio l�quido: " + liquido);
	}

}
