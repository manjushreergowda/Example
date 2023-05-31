import java.util.Scanner;

public class P2 {

	public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
System.out.println("enter the array size");
int size=sc.nextInt();
int[] a=new int[size];
System.out.println("enter the elements of array");
for (int i = 0; i < a.length; i++) {
	a[i]=sc.nextInt();
}
System.out.println("array elements are");
for(int i:a)
{
System.out.println(i);	
}
	}

}
