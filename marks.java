import java.util.Scanner;
public class marks
{
public static void main(String args[]) 
{
int count=10;
Scanner k = new Scanner(System.in);
int RollNo[] = new int[count];
int s1[] = new int[count];
int s2[] = new int[count];
int s3[] = new int[count];
double Total[] = new double[count];
for (int i = 0; i < count; i++) 
{
System.out.println("Enter student " + (i+1) + " details:");
System.out.print("Roll No: ");
RollNo[i] = k.nextInt();
System.out.print("Subject 1 Marks: ");
s1[i] = k.nextInt();
System.out.print("Subject 2 Marks: ");
s2[i] = k.nextInt();
System.out.print("Subject 3 Marks: ");
s3[i] = k.nextInt();
Total[i] = s1[i]+s2[i]+s3[i];
}
System.out.println("\nRoll No\tTotal Marks");
for (int i = 0; i < count; i++) 
{
System.out.println(RollNo[i] + "\t" + Total[i]);
}
}
}
