import java.util.*;
class eligibility
{
public static void main(String args[])
{
int x;
System.out.println("Enter the age:");
Scanner S=new Scanner(System.in);
x=S.nextInt();
if(x>=18)
{
System.out.println("Eligible for voting");
}
else
{
System.out.println("You are eligible to vote after "+(18-x)+" years");
}
}
}
