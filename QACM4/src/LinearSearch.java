import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size=sc.nextInt();
		int[] a=new int[size];
		System.out.println("enter the elements ");
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
		
	}

}
