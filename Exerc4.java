package exercicio1;

import java.util.Scanner;

public class Exerc4 {

	public static void main(String[] args) {
		/* 4. Faça um Programa que peça as 4 
		      notas bimestrais e mostre a média. */
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("digite a primeira nota: ");
		double n1 = entrada.nextInt();
		System.out.print("digite a segunda nota: ");
		double n2 = entrada.nextInt();
		System.out.print("digite a segunda nota: ");
		double n3 = entrada.nextInt();
		System.out.print("digite a segunda nota: ");
		double n4 = entrada.nextInt();
		
		entrada.close();
		System.out.println("a média das notas " + n1 + ", " + n2 + ", "+ n3 + ", " + n4 +" é: "+((n1+n2+n3+n4)/4));
	}

}
