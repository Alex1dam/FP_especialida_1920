package primeraPaquete;

import java.util.Scanner;

public class bateria2_19
{
	private static Scanner numero;
	public static void main(String args[]) 
	{
	int dia=0;
	int mes=0;
	int a�o=0;
	System.out.println("Introduzca el dia");
	numero = new Scanner(System.in);
    dia = numero.nextInt();
    System.out.println("Introduzca el mes");
	numero = new Scanner(System.in);
    mes = numero.nextInt();
    System.out.println("Introduzca el a�o");
	numero = new Scanner(System.in);
    a�o = numero.nextInt();
    if ((a�o%4==0)&&((a�o%100!=0)||(a�o%400==0)))
    {
    	
    }
    else if (dia==29&mes==2)
    {
    	    dia=1;
    	    mes=mes+1;
    }
    if (dia==31&mes==12)
    {
    	dia=1;
    	mes=1;
    	a�o=a�o+1;
    }
    if (dia==28&mes==2)
    {
    dia=1;
    mes=mes+1;
    }else
    if (dia==30&mes==3|dia==30&mes==6|dia==30&mes==9|dia==30&mes==11)
    {
    dia=1;
    mes=mes+1;
    }else
    if (dia==31&mes==1|dia==31&mes==4|dia==31&mes==5|dia==31&mes==7|dia==31&mes==8|dia==31&mes==10)
    {
    dia=1;
    mes=mes+1;
    }else
    {
    	dia=dia+1;
    }
    if(dia>31&mes==1|dia>=30&mes==2|dia>30&mes==3|dia>31&mes==4|dia>31&mes==5|dia>30&mes==6|dia>=31&mes==7|dia>=31&mes==8|dia>30&mes==9|dia>31&mes==10|dia>30&mes==11|dia>31&mes==12|mes>12)
    {
    	System.out.println("Fecha invalida");
    }
    else
    {
        System.out.print("El siguiente dia es "+dia);
        System.out.print(":"+mes);
        System.out.print(":"+a�o);	
    }
	}
}