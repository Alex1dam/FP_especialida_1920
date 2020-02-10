package primeraPaquete;
import java.lang.Math; 
class bateria2__11
{ 
    public static void main(String args[]) 
    { 
        		 for (int i=0 ; i<20 ;i++)
        		 {
        			  int max = 10; int min = 0; int range = max - min + 1; 
        	           int rand = (int)(Math.random() * range) + min; 
        	 System.out.print(" "+rand);
        	         }
    }
    }