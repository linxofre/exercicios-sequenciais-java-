package exercicio1;

import java.util.Scanner;

public class Exerc16 {

	public static void main(String[] args) {
/*16.Faça um Programa para uma loja de tintas. O programa deverá pedir o tamanho em
metros quadrados da área a ser pintada. Considere que a cobertura da tinta é de 1 litro
para cada 6 metros quadrados e que a tinta é vendida em latas de 18 litros, que custam
R$ 80,00 ou em galões de 3,6 litros, que custam R$ 25,00.
o Informe ao usuário as quantidades de tinta a serem compradas e os respectivos
preços em 2 situações:
o comprar apenas latas de 18 litros;
o comprar apenas galões de 3,6 litros;*/
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o tamanho (metros quadrados) da área a ser pintada: ");
		double area = entrada.nextDouble();
		
		double litros = area / 6;
		int lata_de_tinta = (int) (litros / 18);
		
			if (lata_de_tinta == 0) {
				lata_de_tinta = 1;
			}
				
		double valor_18 = lata_de_tinta * 80;
		
		int lata_tinta_36 = (int) (litros / 3.6);
		
			if (lata_tinta_36 == 0) {
				lata_tinta_36 = 1;
			}
				
		double valor_36 = (double)(lata_tinta_36 * 25);

		if (lata_de_tinta == 1) {
			System.out.println("1 lata de 18 litros é o suficinte para " + area + " (em metros quadrados)");
			System.out.println("O total a pagar (Latas 18 litros): " + valor_18);
		} else {			
			System.out.println(lata_de_tinta + " latas de 18 litros são o suficiente para " + area + " (em metros quadrados)");
			System.out.println("total a pagar (18 litros): " + valor_18);
		}
		
		if (lata_tinta_36  == 1) {
			System.out.println("1 lata de 3,6 litros é o suficinte para " + area + " (em metros quadrados)");
			System.out.println("total a pagar (Latas 3,6 litros): " + valor_36);
		} else {			
			System.out.println(lata_tinta_36 + " latas de 3,6 litros são o suficiente para " + area + " (em metros quadrados)");
			System.out.println("total a pagar (3,6 litros): " + valor_36);
		}
		entrada.close();
	}
}
