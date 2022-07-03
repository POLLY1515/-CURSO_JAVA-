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
	  System.out.println("Imprimindo horário atual:");
	  Date x3 = new Date();
	  System.out.println(dt2.format(x3));
	  


		}

	}


