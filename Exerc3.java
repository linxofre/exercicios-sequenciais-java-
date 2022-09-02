package exercicio1;

import java.util.Scanner;

public class Exerc3 {

	public static void main(String[] args) {
		/* 3. Faça um Programa que peça dois 
		      números e imprima a soma */
		Scanner entrada = new Scanner(System.in);
		System.out.print("digite o primeiro número: ");
		int n1 = entrada.nextInt();
		System.out.print("digite o segundo número: ");
		int n2 = entrada.nextInt();
		
		entrada.close();
		System.out.println("a soma de " + n1 + " e " + n2 + " é: "+(n1+n2));
	}

}
