import java.util.*;
class pattern
{
public static void main(String args[])
{
int rows,i,j,k;
Scanner S=new Scanner(System.in);
System.out.println("Enter the number of rows:");
rows=S.nextInt();
for(i=0;i<rows;i++)
{
for(j=0;j<=i;j++)
{
for(k=0;k<=i;k++)
{
System.out.print(9);
}
System.out.print("\t");
}
System.out.println();
}
}
}