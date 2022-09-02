package exercicio1;

import java.util.Scanner;

public class Exerc15 {

	public static void main(String[] args) {
/*15.Faça um programa para uma loja de tintas.
 * O programa deverá pedir o tamanho em
 * metros quadrados da área a ser pintada. 
 * Considere que a cobertura da tinta é 
 * de 1 litro para cada 3 metros quadrados 
 * e que a tinta é vendida em latas de 18 
 * litros, que custam R$ 80,00. 
 * Informe ao usuário a quantidades de 
 * latas de tinta a serem compradas 
 * e o preço total.*/

		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o tamanho (metros quadrados) da área a ser pintada? ");
		double area = entrada.nextDouble();
		
		double litros = area / 3;
		int lata_de_tinta = (int)(litros / 18);
		
		if (lata_de_tinta == 0) {
			lata_de_tinta = 1;
		}
		
		double sobra = litros - (18 * lata_de_tinta);
		double valor = lata_de_tinta * 80;
		
		if (lata_de_tinta == 1) {
			System.out.println("1 lata é o suficinte para " + area + " em metros quadrados");
			System.out.println("sobra de: " + sobra + " Litros");
			System.out.println("Valor: " + valor);
		} else {			
			System.out.println(lata_de_tinta + " são o suficiente para " + area + " em metros quadrados");
			System.out.println("total de sobra: " + sobra + " Litros");
			System.out.println("Valor: " + valor);
		}
		entrada.close();
	}
}
	
