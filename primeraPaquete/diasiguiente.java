	package primeraPaquete;
		import java.util.Scanner;
		public class diasiguiente
		{
			public static void main(String args[]) throws InterruptedException 
			{
				int dia=0;
				int mes=0;
				int año=0;
				int dias=0;
				int meses=0;
				int años=0;
				System.out.println("Introduzca el dia");
				Scanner numero = new Scanner(System.in);
			    dia = numero.nextInt();
			    System.out.println("Introduzca el mes");
				numero = new Scanner(System.in);
			    mes = numero.nextInt();
			    System.out.println("Introduzca el año");
				numero = new Scanner(System.in);
			    año = numero.nextInt();
				System.out.println("Introduzca el dia");
				numero = new Scanner(System.in);
			    int dia1 = numero.nextInt();
			    System.out.println("Introduzca el mes");
				numero = new Scanner(System.in);
			    int mes1 = numero.nextInt();
			    System.out.println("Introduzca el año");
				numero = new Scanner(System.in);
			    int año1 = numero.nextInt();
			for (int i=dia;i>dia1;i++)
		{
		dias++;
		}
			for (int y=mes;y>mes1;y++)
			{
			meses++;
		}
			for (int z=año;z>año1;z++)
			{
			años++;
		}
			System.out.print("Hay "+dias);System.out.print(" dias, "+meses);System.out.print(" meses y "+años);System.out.print(" años");
		}
		}