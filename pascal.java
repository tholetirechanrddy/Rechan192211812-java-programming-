import java.util.*;
class pascal
{
public static void main(String args[])
{
int i,j,space=1,coef=1,rows;
System.out.println("Enter number of rows:");
Scanner S=new Scanner(System.in);
rows=S.nextInt();
for(i=0;i<rows;i++)
{
for(space=1;space<=rows-i;space++)
{
System.out.print(" ");
}
for(j=0;j<=i;j++)
{
if(j==0 || i==0)
{
coef=1;
}
else
{
coef=coef*(i-j+1)/j;
}
System.out.print(" "+coef);
}
System.out.print("\n");
}
}
}