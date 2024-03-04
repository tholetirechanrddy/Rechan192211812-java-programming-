import java.util.*;
class salary
{
int empno,basicpay;
double hra,ta,da,pf,lic,netsalary,ded,grosssalary;
String empname;
void salary()
{
Scanner s=new Scanner(System.in);
System.out.println("Enter employee name:");
empname=s.nextLine();
System.out.println("Enter employee no:");
empno=s.nextInt();
System.out.println("Enter basic pay:");
basicpay=s.nextInt();
hra=basicpay*0.10;
ta=basicpay*0.20;
da=basicpay*0.15;
pf=basicpay*0.12;
lic=basicpay*0.20;
netsalary=(basicpay+hra+da+ta);
ded=(pf+lic);
grosssalary=(netsalary-ded);
System.out.println("Net Salary:"+netsalary);
System.out.println("Deduction:"+ded);
System.out.println("Gross salary:"+grosssalary);
};
}
class empreport
{
public static void main(String args[])
{
salary x=new salary();
x.salary();
}
}