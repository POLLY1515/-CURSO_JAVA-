package EstrururaSequencial;

import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {
		//Fazer um programa para ler o c�digo de uma pe�a 1,
		//o n�mero de pe�as 1, o valor unit�rio de cada pe�a 1,
		//o c�digo de uma pe�a 2, o n�mero de pe�as 2 
		//e o valor unit�rio de cada pe�a 2.
		//Calcule e mostre o valor a ser pago.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o c�digo da pe�a 1:"); 
		int cod = sc.nextInt();
		System.out.println("Entre com a quantdade de pe�as 1:");
		int quant = sc.nextInt();
		System.out.println("Entre com o valor da  pe�a 1:");
		double valor = sc.nextDouble();
		System.out.println("Entre com o codigo da pe�a 2:");
		int cod2 = sc.nextInt();
		System.out.println(" Entre com a quantidade de pe�as 2:");
		int quant2 = sc.nextInt();
		System.out.println("Entre com o valor de pe�as 2:");
		double valor2 = sc.nextDouble();
		
		double p1 = quant * valor;
		double p2 = quant2 * valor2;
		double soma = (p1 + p2);
		
		double total = soma;
		System.out.println("valor � pagar : R$ " + total);
		
		
		




	}
}
