package EstruturaCondicional;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		//Escreva um programa que leia o código de um item e 
		//a quantidade deste item. A seguir, calcule e mostre o valor
		//da conta a pagar.
		
			
		
			Scanner sc = new Scanner(System.in);
			
			
			System.out.println("Código:1 |Cachorro quente |Preço R$:4.00");
			System.out.println("==========================================");
			System.out.println("Código:2 |X_Salada|Preço R$:4.50");
			System.out.println("=========================================");
			System.out.println("Código:3 |X_Bacon |Preço R$:5.00");
			System.out.println("=========================================");
			System.out.println("Código:4 |Torrada-simples |Preço R$:2.00");
			System.out.println("==========================================");
			System.out.println("Código:5 |Refrigerante |Preço R$:1.50");
			
			System.out.println("Escolha uma opção:");
			int x = sc.nextInt();
			String item;
			System.out.println("Qual a quantidade:");
			int quant = sc.nextInt();
			
			switch (x) {
			case 1:
				item = "Cachorro quente";
				double valor = quant * 4.00;
				System.out.println( item + " Total: " + valor);
				break;
			case 2:
				item = "X_Salada";
				double valor2 = quant * 4.50;
				System.out.println( item + " Total: " + valor2);
				break;
			case 3:
				item = "X_Bacon";
				double valor3 = quant * 5.00;
				System.out.println(  item +" Total: " + valor3);
				break;
			case 4:
				item = "Torrada_simples";
				double valor4 = quant * 2.00;
				System.out.println( item + " Total: " + valor4);
				break;
			case 5:
				item = "Refrogerante";
				double valor5 = quant * 1.50;
				System.out.println( item +" Total: " + valor5);
				break;
				
				
				
			}		// TODO Auto-generated method stub

	}

}
