package primeraPaquete;
public class bateria25
{
public static void main(String args[])
{ 
    int a=2;
    int b=0;
   do 
     {  
    	 b=b+a;
    	 a=a+3;
    	 b=b+a;
    	 System.out.println(""+a);
    	 a=a+2;
    	 b=b+a;
    	if (a<1800)
    	System.out.println(""+a);
     }
   while (a<1800);
     System.out.println(""+b);
} 
} 