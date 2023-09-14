import java.util.Scanner;

public class GraddingSystemEx 
{
	public static void main(String[] args) {
		
		
		int maths,Sci,English,hindi,guj,total;
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter Marks for Maths");
		maths = sc.nextInt();
		
		System.out.println("Enter Marks for Science");
		Sci = sc.nextInt();
		
		System.out.println("Enter Marks for English");
		English = sc.nextInt();
		
		System.out.println("Enter Marks for Hindi");
		hindi = sc.nextInt();
		
		System.out.println("Enter Marks for Gujarati");
		guj = sc.nextInt();
		
		total = maths+Sci+English+hindi+guj;
		
		System.out.println(total);
		
		float per = total/5;
		
		System.out.println(per);
		
	}
}
