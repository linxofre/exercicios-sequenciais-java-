package exercicio1;

import java.util.Scanner;

public class Exerc10 {

	public static void main(String[] args) {
		/* 10.Fa�a um Programa que pe�a 2 n�meros 
		 * inteiros e um n�mero real. Calcule e mostre:
		 * 
		 * a. o produto do dobro do primeiro 
		 * com metade do segundo .
		 * 
		 * b. a soma do triplo do primeiro 
		 * com o terceiro.
		 * 
		 * c. o terceiro elevado ao cubo. */

		Scanner entrada = new Scanner(System.in);
		System.out.print("digite o primeiro n�mero inteiro: ");
		int n1 = entrada.nextInt();
		System.out.print("digite o SEGUNDO n�mero inteiro: ");
		int n2 = entrada.nextInt();
		System.out.print("agora digite um n�mero real: ");
		double n3 = entrada.nextInt();
		
		entrada.close();
		System.out.println("a. o produto do dobro do primeiro com metade do segundo: " + 
							((n1*2)*(n2/2)));
		System.out.println("b. a soma do triplo do primeiro com o terceiro: " + 
							(n1*3+n3));
		System.out.println("c. o terceiro elevado ao cubo: " + n3*n3*n3);
	}

}
