package EstrururaSequencial;

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		//Fazer um programa para ler quatro valores inteiros
		//A, B, C e D. A seguir, calcule e mostre a diferença 
		//do produto
		//de A e B pelo produto de C e D segundo a fórmula: 
		//DIFERENCA = (A * B - C * D).
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro valor:");
		int A = sc.nextInt();
		System.out.println("Entre com o segundo valor:");
		int B = sc.nextInt();
		System.out.println("Entre com o terceiro valor:");
		int C = sc.nextInt();
		System.out.println("Entre com o quarto valor:");
		 int D = sc.nextInt();
		 
		int diferenca = (A * B - C *D);
		
		System.out.println("Entrada:");
		System.out.println(A);
		System.out.println(B);
		System.out.println(C);
		System.out.println(D);
		
		System.out.println("Diferença:" + diferenca);
	}
}
