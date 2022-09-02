package exercicio1;

import java.util.Scanner;

public class Exerc12 {

	public static void main(String[] args) {
		/*12.Tendo como dado de entrada 
		 * a altura, construa um algoritmo 
		 * que calcule seu peso ideal,
		 * utilizando as seguintes fórmulas:
		 * 
		 * Para homens: (72.7*h) - 58
		 * Para mulheres:(62.1*h)-44.7
		 * (h = altura)	 */
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o sexo: ");
		String tipo = entrada.next();
		
		System.out.print("Informe a altura: ");
		double h = entrada.nextDouble();
		
		double peso = 0;
		
		if (tipo.equals("m")) {
			peso = (72.7*h) - 58;
		}
		else {
			if (tipo.equals("f")) 
				peso = (62.1*h)-44.7;	
		}
		entrada.close();
		System.out.println("\n gênero: " + tipo);
		System.out.println("\n peso ideal: " + peso);
	}
}
