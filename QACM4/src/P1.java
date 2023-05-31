
import java.util.Scanner;

public class P1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size=sc.nextInt();
		
		double[] a=new double[size];
		System.out.println("enter the array elements");
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextDouble();
		}
		double sum=0;
		System.out.println("sum of all the elements of arrays is :");
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum);
	}

}
