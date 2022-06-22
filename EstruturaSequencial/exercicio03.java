package EstrururaSequencial;

import java.util.Scanner;

public class exercicio03 {
	public static void main(String[] args) {
		//Faça um programa para ler o valor do raio de um círculo,
		//e depois mostrar o valor da área deste círculo com quatro
		//casas decimais conforme exemplos.
		//Fórmula da área: area = π . raio2
		//Considere o valor de π = 3.14159
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o valor do raio");
		double raio = sc.nextFloat();
		 double pi = 3.14159;
		 double area = pi *(raio * raio);
		 
		 System.out.println("Entrada: " + raio);
		 System.out.println("Saida:"+ area);
	}



}
