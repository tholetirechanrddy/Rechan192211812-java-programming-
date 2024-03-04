import java.util.*;
class sum
{
int x,y;
void add()
{
Scanner S=new Scanner(System.in);
System.out.println("Enter the numbers:");
x=S.nextInt();
y=S.nextInt();
System.out.println("Sum:"+(x+y));
};
}
class sum1
{
public static void main(String args[])
{
sum x=new sum();
x.add();
}
}