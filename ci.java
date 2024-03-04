import java.util.*;
class intrest
{
int p,n,r;
float ci,si;
void intrest()
{
Scanner S=new Scanner(System.in);
System.out.println("Enter principal amount:");
p=S.nextInt();
System.out.println("Enter number of years:");
n=S.nextInt();
System.out.println("Enter the rate:");
r=S.nextInt();
si=(p*n*r)/100;
System.out.println("Simple Intrest:"+si);
ci=p*(pow((1+r/100),n));
System.out.println("Compound Intrest:"+ci);
};
}
class ci
{
public static void main(String args[])
{
intrest x=new intrest();
x.intrest();
}
}