package Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class dateTeste {


		public static void main(String[] args) throws ParseException {
	SimpleDateFormat dt = new SimpleDateFormat("dd/MM/yyyy");
	SimpleDateFormat dt2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	  Date x1 = dt.parse("30/05/2022");
	  Date x2 = dt2.parse("31/05/2022 14:30:56");
	  System.out.println(x1);
	  System.out.println(x2);
	  System.out.println("Imprimindo formatado:");
	  System.out.println(dt.format(x1));
	  System.out.println(dt2.format(x2));
	  System.out.println("Imprimindo hor�rio  e data atual:");
	  Date x3 = new Date();
	  System.out.println(dt2.format(x3));
	  System.out.println("========================================================");
	  
	  Date data = new Date();
	  System.out.println("Imprimindo data em milissegundos:" + data.getTime());
	  System.out.println("Imprimindo dis do m�s:" + data.getDate());
	  System.out.println("Imprimindo a hora do dia:" + data.getHours());
	  System.out.println("Imprimindo os minutos do dia:" + data.getMinutes());
	  System.out.println("Imprimindo o ano:" + (data.getYear()+ 1900));






		}

	}


