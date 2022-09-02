package exercicio1;

import java.util.Scanner;

public class Exerc2 {

	public static void main(String[] args) {
		/* 2. Faça um Programa que peça um 
		   número e então mostre a mensagem 
		   O número informado foi [número]. */
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("digite o número: ");
		int num = entrada.nextInt();
		
		entrada.close();
		System.out.println("o número informado foi " + num);
	}

}
