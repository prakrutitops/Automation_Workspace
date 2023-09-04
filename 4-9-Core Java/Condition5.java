import java.util.Scanner;

public class Condition5 
{
	public static void main(String[] args) {
		
		
		
		
		Scanner sc = new Scanner(System.in);//Scanner will get value from user
		//System.out.println("\n Choose 1 For English \n Choose 2 For Hindi \n Choose 3 For Gujarati");
		int num = sc.nextInt() ;
		
		if(num==1)
		{
			System.out.println("Your Selected Language is English");
		}
		if(num==2)
		{
			System.out.println("Your Selected Language is Hindi");

		}
		if(num==3)
		{
			System.out.println("Your Selected Language is Gujarati");

		}
		
		
	}
}
