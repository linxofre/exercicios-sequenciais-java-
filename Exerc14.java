package exercicio1;

import java.util.Scanner;

public class Exerc14 {

	public static void main(String[] args) {
/*14.Faça um Programa que pergunte quanto 
 * você ganha por hora e o número de horas
 * trabalhadas no mês. Calcule e mostre o 
 * total do seu salário no referido mês, 
 * sabendo-se que são descontados 11% para 
 * o Imposto de Renda, 8% para o INSS e 
 * 5% para o sindicato, faça um programa 
 * que nos dê:
 * 
a. salário bruto.
b. quanto pagou ao INSS.
c. quanto pagou ao sindicato.
d. o salário líquido.
e. calcule os descontos e o salário líquido, conforme a tabela abaixo:
f. + Salário Bruto : R$
g. - IR (11%) : R$
h. - INSS (8%) : R$
i. - Sindicato ( 5%) : R$
j. = Salário Liquido : R$
Obs.: Salário Bruto - Descontos = Salário Líquido.

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
		System.out.println("\n salário bruto: " + bruto);
		System.out.println("\n imposto de renda: " + ir);
		System.out.println("\n INSS: " + inss);
		System.out.println("\n sindicato: " + sindicato);
		System.out.println("\n salário líquido: " + liquido);
	}

}
