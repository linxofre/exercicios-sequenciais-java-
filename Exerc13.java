package exercicio1;

import java.util.Scanner;

public class Exerc13 {

	public static void main(String[] args) {
/*13.Jo�o Papo-de-Pescador, homem de bem, 
 * comprou um microcomputador para controlar o
 * rendimento di�rio de seu trabalho. Toda vez 
 * que ele traz um peso de peixes maior que o
 * estabelecido pelo regulamento de pesca do 
 * estado de S�o Paulo (50 quilos) deve pagar
 * uma multa de R$ 4,00 por quilo excedente. 
 * Jo�o precisa que voc� fa�a um programa
 * que leia a vari�vel peso (peso de peixes) 
 * e verifique se h� excesso. Se houver, 
 * gravar na vari�vel excesso e na vari�vel 
 * multa o valor da multa que Jo�o dever� pagar.
 * Caso contr�rio mostrar tais vari�veis 
 * com o conte�do ZERO OU NEGATIVO.
* 
*/		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a quantidade de quilos pescados hoje: ");
		double peso = entrada.nextDouble();
		double excesso = 0;
		double multa = 0;
		
		if (peso > 50) {
			excesso = peso - 50;
			multa = excesso * 4.0;
		}
		entrada.close();
		System.out.println("\n quantidade pescada: " + peso);
		System.out.println("\n excesso: " + excesso);
		System.out.println("\n multa: " + multa);
	}

}
