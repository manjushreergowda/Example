import java.util.Scanner;

public class P3 {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter the size of an array");
int size=sc.nextInt();
int[] a=new int[size];
System.out.println("enter the elements of the array");
for (int i = 0; i < a.length; i++) {
	a[i]=sc.nextInt();
}

for (int i = 0; i < a.length; i++) {
	for (int j = 0; j < a.length-1; j++) {
		if(a[j]>a[j+1])
		{
			int temp=a[j];
			a[j]=a[j+1];
			a[j+1]=temp;
			
		}
		
	}
}
System.out.println("array elemets are sorted");
for (int i = 0; i < a.length; i++) {
	System.out.println(a[i]);
}
	}
	}


