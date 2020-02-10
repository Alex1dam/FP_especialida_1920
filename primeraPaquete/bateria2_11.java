package primeraPaquete;
import java.lang.Math; 
class bateria2_12
{ 
    public static void main(String args[]) 
    { 
       int maximo =0;;
       int minimo=200;
       int suma=0;;
       int contador=0;
        		 for (int i=0 ; i<50 ;i--)
        		 {
        			  int max = 199; int min = 100; int range = max - min + 1; 
        	           int rand = (int)(Math.random() * range) + min; 
        	          int numero1=rand;
        	  if (numero1>maximo)
        	  {
        		  maximo=numero1;
        	  }
        	  if (numero1<minimo)
        	  {
        		  minimo=numero1;
        	  }
        	  suma=suma+numero1;
        	 contador++;
        	 System.out.println(""+numero1);
        	         }
        	int media=suma/contador;
        	System.out.print("El maximo es "+maximo);
        	System.out.print(" El minimo es "+minimo);
        	System.out.println(" La media es "+media);


    }
    }