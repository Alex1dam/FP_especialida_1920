package primeraPaquete;

public class multiplo24
{
public static void main(String args[])
{
int y = 1;
for (int x =0; x<100 ; x++)
{
y=y+1;
if ((y%2<=0)&&(y%3<=0))
	System.out.println("Es multiplo de 2 y 3 "+y);
else
{
	if (y%2<=0)
		System.out.println("Es multiplo de 2: "+y);
	else 
		{if (y%3<=0)
			System.out.println("Es multiplo de 2: "+y);
		}
}

}
}
}