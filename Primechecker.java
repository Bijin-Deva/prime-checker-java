package Demo;
import java.util.Scanner;
public class Primechecker {
	static boolean isPrime(int n)
	{
		if(n<2)
		{
			return false;
		}
		for(int i=2;i*i<=n;i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   Scanner scan	= new Scanner(System.in);
	   int n = scan.nextInt();
	   if(isPrime(n))
	   {
		   System.out.println("Prime");
	   }
	   else
	   {
		   System.out.println("Not Prime");
	   }
	   scan.close();

	}

}
