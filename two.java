import java.util.*;

class two
{
	 public static void main(String[]args) 
	{
		int sum=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of times want to print\n");
		int n=scan.nextInt();
		System.out.println("Below your loop running");
		for(int i=1;i<=n;i++) {
			int x=sum+i;
			System.out.println(x+"\n");
			System.out.println(" ");

			
		}
	}
}
