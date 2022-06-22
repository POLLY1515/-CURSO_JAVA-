package EstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		// imposto de renda
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Entre com o salário");
		double salario = sc.nextDouble();
		double imposto = 0.0;
		if(salario <= 2000) {
			System.out.println("Isento");
			
		}else if(salario > 2000.01 && salario <= 3000.00) {
			imposto = salario - (salario - (salario * 0.08))  ;
		}else if(salario > 3000.01 && salario <= 4500.00) {
			imposto = salario - (salario - (salario * 0.18))  ;

		}else {
			imposto = salario - (salario - (salario * 0.28))  ;

		}

		System.out.printf("Valor a pagar de imposto R$:%.2f" , imposto );
	}

}
