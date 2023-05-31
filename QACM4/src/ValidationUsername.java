
import java.util.Scanner;

public class ValidationUsername {

	public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
System.out.println("enter the username");
String username=sc.nextLine();
int UpperCase=0;
int LowerCase = 0;
int SplChar=0;
int digits=0;
char[] allChars=username.toCharArray();

for(int i=0; i<allChars.length;i++)
{
	if(allChars[i]>='A' && allChars[i]<='Z')
	{
		UpperCase++;
	}
	else if(allChars[i]>='a' && allChars[i]<='z')
	{
		LowerCase++;
	}
	else if(allChars[i]>='0' && allChars[i]<='9') 
	{
		digits++;
	}
	else 
	{
		SplChar++;
	}
}
if(allChars.length>=8 && UpperCase>=1 && LowerCase>=1 && SplChar>=1 && digits>=2)

	System.out.println("username is valid");
	else
		System.out.println("username is invalid");
	}
	}


