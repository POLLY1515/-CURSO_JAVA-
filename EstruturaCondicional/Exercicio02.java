package EstruturaCondicional;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		//Fazer um programa para ler um n�mero inteiro e dizer se
		//este n�mero � par ou �mpar.
		
	Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com um numero inteiro:");
		int num = sc.nextInt();
		if(num % 2 == 0	) {
			System.out.println("Par!");
		}else {
			System.out.println("Impar!");
		}
        sc.close();
	}

}
