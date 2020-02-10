package primeraPaquete;

import java.util.Scanner;

public class bateria2_19
{
	private static Scanner numero;
	public static void main(String args[]) 
	{
	int dia=0;
	int mes=0;
	int año=0;
	System.out.println("Introduzca el dia");
	numero = new Scanner(System.in);
    dia = numero.nextInt();
    System.out.println("Introduzca el mes");
	numero = new Scanner(System.in);
    mes = numero.nextInt();
    System.out.println("Introduzca el año");
	numero = new Scanner(System.in);
    año = numero.nextInt();
    if ((año%4==0)&&((año%100!=0)||(año%400==0)))
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
    	año=año+1;
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
        System.out.print(":"+año);	
    }
	}
}