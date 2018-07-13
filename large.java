import java.util.Scanner;
public class large {
	public static void main(String[] args) {
	int n;
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the no of element:");
	n=in.nextInt();
	int a[]=new int[n];
	System.out.println("Enter the number:");
	for(int i=0;i<n;i++)
	{
		a[i]=in.nextInt();
	}
int max=a[0];
for(int i=0;i<n;i++)
{
	if(a[i]>max)
	{
		max=a[i];
	}
}
System.out.println(max);
in.close();
	}
}
