package EstrururaSequencial;

import java.util.Scanner;

public class Exercicio04 {
	

		public static void main(String[] args) {
			//Fazer um programa que leia o n�mero de um funcion�rio, 
			//seu n�mero de horas trabalhadas, o valor que recebe por
			//hora e calcula o sal�rio desse funcion�rio. A seguir,
			//mostre o n�mero e o sal�rio do funcion�rio, com duas casas
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
			System.out.println("Sal�rio:" + salario);
		}
}
