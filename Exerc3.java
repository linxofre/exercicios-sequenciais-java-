package exercicio1;

import java.util.Scanner;

public class Exerc3 {

	public static void main(String[] args) {
		/* 3. Fa�a um Programa que pe�a dois 
		      n�meros e imprima a soma */
		Scanner entrada = new Scanner(System.in);
		System.out.print("digite o primeiro n�mero: ");
		int n1 = entrada.nextInt();
		System.out.print("digite o segundo n�mero: ");
		int n2 = entrada.nextInt();
		
		entrada.close();
		System.out.println("a soma de " + n1 + " e " + n2 + " �: "+(n1+n2));
	}

}
