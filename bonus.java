import java.util.*;
class bonus
{
public static void main(String args[])
{
int salary;
char grade;
Scanner s=new Scanner(System.in);
System.out.println("Enter the grade:");
grade=s.next().charAt(0);
System.out.println("Enter the salary:");
salary=s.nextInt();
if(grade=='A' && salary > 10000 )
{
System.out.println("Bonus:"+(salary*0.5));
}
else if(grade=='B' && salary > 10000)
{
System.out.println("Bonus:"+(salary*0.1));
}
else if(grade=='A' && salary < 10000)
{
System.out.println("Bonus:"+(salary*0.7));
}
else if(grade=='B' && salary < 10000)
{
System.out.println("Bonus:"+(salary*0.12));
}
else
{
System.out.println("Invalid");
}
}
}
