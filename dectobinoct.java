import java.util.*;
class dectobinoct
{
public static void main(String args[])
{
int dec,f=0,ind=0;
Scanner S=new Scanner(System.in);
int bin[]=new int[20];
int oct[]=new int[20];
System.out.println("Enter the number:");
dec=S.nextInt();
while(dec!=0)
{
bin[ind++]=dec%2;
dec=dec/2;
}
System.out.print("Binary value:");
for(int i = ind-1;i >= 0;i--)
{    
System.out.print(bin[i]);    
} 
System.out.println();
System.out.println("Enter the number:");
dec=S.nextInt();
while(dec!=0)
{
oct[f++]=dec%8;
dec=dec/8;
}
System.out.println("Octal value:"); 
for(int j = f-1;j >= 0;j--)
{    
System.out.print(oct[j]);    
}
}
}