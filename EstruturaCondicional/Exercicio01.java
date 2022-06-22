package EstruturaCondicional;

import java.util.Scanner;

public class Exercicio01 {
	
	public static void main(String[] args) {
		//Fazer um programa para ler um número inteiro, e depois 
		//dizer se este número é negativo ou não.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com um numero inteiro:");
		int num = sc.nextInt();
		if(num < 0) {
			System.out.println("Numero negativo!");
		}else {
			System.out.println("Numero não_negativo!");
		}
        sc.close();
	}

}
