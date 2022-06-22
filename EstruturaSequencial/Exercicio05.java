package EstrururaSequencial;

import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {
		//Fazer um programa para ler o código de uma peça 1,
		//o número de peças 1, o valor unitário de cada peça 1,
		//o código de uma peça 2, o número de peças 2 
		//e o valor unitário de cada peça 2.
		//Calcule e mostre o valor a ser pago.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o código da peça 1:"); 
		int cod = sc.nextInt();
		System.out.println("Entre com a quantdade de peças 1:");
		int quant = sc.nextInt();
		System.out.println("Entre com o valor da  peça 1:");
		double valor = sc.nextDouble();
		System.out.println("Entre com o codigo da peça 2:");
		int cod2 = sc.nextInt();
		System.out.println(" Entre com a quantidade de peças 2:");
		int quant2 = sc.nextInt();
		System.out.println("Entre com o valor de peças 2:");
		double valor2 = sc.nextDouble();
		
		double p1 = quant * valor;
		double p2 = quant2 * valor2;
		double soma = (p1 + p2);
		
		double total = soma;
		System.out.println("valor á pagar : R$ " + total);
		
		
		




	}
}
