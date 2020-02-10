package primeraPaquete;

import java.util.Scanner;

public class bateria15
{
private static Scanner vec2;
private static Scanner veces;

public static void main(String args[])
{ 
   double descuento=0;
   double preciofinal=0;
   double precio=0;
   int a=1;
	vec2 = new Scanner(System.in);
    System.out.println("Introduce el iva");
	double iva = veces.nextDouble();
    System.out.println("Introduce la factura");
    double factura = veces.nextDouble();
	for (a=1;a>0;a++)
	{
		if (iva==4||iva==10||iva==21)
			a=-1;
		else
		{
			vec2 = new Scanner(System.in);
		    System.out.println("Iva erroneo, Introduzca el iva y la factura de nuevo, por favor");
		   iva = vec2.nextInt();
		   factura = vec2.nextInt();
		}
	}
	if (factura>=1000&factura<10000)
		descuento=5;
	if (factura>=10000)
	{
		descuento=10;
	}
	precio=factura*((100+iva)/100);
	preciofinal=precio*((100-descuento)/100);
	System.out.println("El precio es "+precio); System.out.print("El precio final es: "+preciofinal);	
	veces.close();
} 
} 