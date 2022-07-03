package trabalhandoComArquivos;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class exemplo01 {

	public static void main(String[] args) {
		// para passar o caminho correto deve-se passar dus barras em cada barrinha
		File file = new File("C:/Nova pasta/doc.txt");
		Scanner sc = null;
		try {
			sc= new Scanner(file);
			while(sc.hasNextLine()) {//testa se ainda exixte uma nova linha no arquivo
				System.out.println(sc.nextLine());//caso exista imprime aqui
				
			 }//fim while
			}
		catch (IOException e) {
			System.out.println("ERROR:" + e.getMessage());
		}
		finally {
			if(file != null) {
			sc.close();//considerado boa pratica colocar o fechamento do scanner no finally
			}
		}
		}

	}


