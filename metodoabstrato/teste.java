package metodoabstrato;

import java.awt.geom.Area;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class teste {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		ArrayList<Forma> list = new ArrayList<>();
		System.out.println("Quantas formas serão lidas?");
		int quant = sc.nextInt();
		for (int cont = 0; cont < quant; cont++) {
			System.out.println("Forma # " + (cont + 1));
			System.out.println("Entre com r para Retangulo ou c para circulo?");
			char ch = sc.next().charAt(0);
			if (ch == 'r') {
				System.out.println("Entre com a cor (Azul,vermelho ou preto):");
				Cor cor = Cor.valueOf(sc.next());
				System.out.println("Entre com a altura:");
				double alt = sc.nextDouble();
				System.out.println("Entre com a larguar:");
				double lar = sc.nextDouble();
				Retangulo ret = new Retangulo(cor, alt, lar);
				list.add(ret);

			} else {
				System.out.println("Entre com a cor (Azul,vermelho ou preto):");
				Cor cor = Cor.valueOf(sc.next());
				System.out.println("Entre com o valor do raio:");
				double v = sc.nextDouble();
				Circulo c = new Circulo(cor, v);
				list.add(c);
			}

		} // fim for
		System.out.println("==========Forma Áreas==========");
		for (Forma item : list) {
			System.out.println(item.area());

		}

		sc.close();
	}

}
