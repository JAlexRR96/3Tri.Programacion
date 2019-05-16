import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		//Estudio de fechas
		
		//Clase DATE
		
		//Declaramos una objeto de la clase 'import java.util.Date;'
		Date fecha=null;
		//Con esta clase capturamos la fecha del sistema
		Date fechaActual=new Date();
		String fechaCadena="29/02/2016";
		String fechaDateString;
		//Para establecer un formato a la fecha utilizaremos:
		SimpleDateFormat formateador=new SimpleDateFormat("dd/MM/yyyy");
		//El mes va en mayusculas
		//Esto es una metodo que comprobara la fecha
		//Si esta en true cocgera cualquier fecha
		formateador.setLenient(false);
	
		//Pasaremos una cadena (fecha) en un dato fecha
		
		try {
			fecha=formateador.parse(fechaCadena);
			System.out.println(fecha.toString());//muestra: Mon Feb 29 00:00:00 CET 2016
			//Cambiamos como va a mostrar la fecha
			fechaDateString=new SimpleDateFormat("dd/MM/yyyy").format(fecha);
			System.out.println(fechaDateString);
			
					
		} catch (ParseException e) {
			// TODO Bloque catch generado automáticamente
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		//Para hacer que la fecha la podamos introducir en una base de datos en sql lo tendremos quew hacaer asi;
		java.sql.Date fechaSql=new java.sql.Date(fecha.getTime());//date a SQL
		System.out.println("Date* SQL "+fechaSql.toString());
		fechaDateString=new SimpleDateFormat("dd/MM/yyyy").format(fechaSql);
		System.out.println(fechaDateString);
		
		//PAra conseguir la fecha actual
		java.sql.Timestamp DateTimestamp=new java.sql.Timestamp(fechaActual.getTime());
		System.out.println(DateTimestamp.toString());
		fechaDateString=new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(DateTimestamp);
		System.out.println(fechaDateString);
		
		
		
	}

}
