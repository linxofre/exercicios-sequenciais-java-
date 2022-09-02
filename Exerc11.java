package exercicio1;

import java.util.Scanner;

public class Exerc11 {

	public static void main(String[] args) {
		/*11.Tendo como dados de entrada a 
		 * altura de uma pessoa, construa 
		 * um algoritmo que 
		 * calcule seu peso ideal, usando 
		 * a seguinte fórmula: 
		 * (72.7*altura) – 58. */
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("digite a altura: ");
		double a = entrada.nextDouble();
		double peso = (72.7 * a) - 58;
		
		entrada.close();
		System.out.println("o peso ideal é: "+ peso);
	}

}
