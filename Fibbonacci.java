import java.util.Scanner;
class Fibbonacci
{
	public static void main(String ar[])
	{
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		num=sc.nextInt();
		int a=0,b=1,c;
		System.out.print(a+" "+b);
		for(int i=1;i<=num;i++)
		{
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}
	}
}