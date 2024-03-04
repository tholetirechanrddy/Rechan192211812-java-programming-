import java.io.*;
import java.util.Scanner;
class valid
{
public static void main(String[] args)
{
String A,B;
Scanner s=new Scanner(System.in);
System.out.println("Enter the User Name :");
A=s.nextLine();
System.out.println("Re-Enter the User Name :");
B=s.nextLine();
if(A.equals(B))
{
System.out.println(" The user name valid");
}
else
{
System.out.println("The user name Invalid");
}
}
}