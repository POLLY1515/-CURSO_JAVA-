package EstrururaSequencial;

import java.util.Scanner;

public class Exercicio04 {
	

		public static void main(String[] args) {
			//Fazer um programa que leia o número de um funcionário, 
			//seu número de horas trabalhadas, o valor que recebe por
			//hora e calcula o salário desse funcionário. A seguir,
			//mostre o número e o salário do funcionário, com duas casas
			//decimais.
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Entre com o seu id:");
			int num = sc.nextInt();
			System.out.println("Quantas horas trabalha por dia:");
			int hora = sc.nextInt();
			System.out.println("Entre com o valor/hora:");
			double valorHora = sc.nextDouble();
			
			int horaMes = hora * 30;
			
			double salario = (horaMes * valorHora) ;
			System.out.println("ID:" + num);
			System.out.println("Salário:" + salario);
		}
}
