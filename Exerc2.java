package exercicio1;

import java.util.Scanner;

public class Exerc2 {

	public static void main(String[] args) {
		/* 2. Fa�a um Programa que pe�a um 
		   n�mero e ent�o mostre a mensagem 
		   O n�mero informado foi [n�mero]. */
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("digite o n�mero: ");
		int num = entrada.nextInt();
		
		entrada.close();
		System.out.println("o n�mero informado foi " + num);
	}

}
