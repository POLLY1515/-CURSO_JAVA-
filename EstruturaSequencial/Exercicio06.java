package EstrururaSequencial;

import java.util.Scanner;

public class Exercicio06 {
	public static void main(String[] args) {
		// Faça um programa para ler dois valores inteiros,
        //e depois mostrar na tela a soma desses números com uma
		// mensagem explicativa.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro valor:");
		double v1 = sc.nextDouble();
		System.out.println("Entre com o segundo valor");
		double v2 = sc.nextDouble();
		
		double soma = v1+ v2;
		
		System.out.println("Primeiro valor:" + v1);
		System.out.println("Segundo valor:" + v2);
		System.out.println("Saída:" + soma);
	
		
	}
}
