import java.io.*;
import java.util.*;
import java.util.concurrent.*;
class A extends Thread
{
public void run()
{
for(int i=0;i<5;i++)
{
System.out.println(i);
}
}
}
class B extends Thread
{
public void run()
{
for(int j=5;j<10;j++)
{
System.out.println(j);
}
}
}
class multithread
{
public static void main(String args[])
{
A a=new A();
a.start();
B b=new B(); 
b.start();
Thread t1 = new Thread(a);
Thread t2 = new Thread(b);
t1.setPriority(Thread.MIN_PRIORITY);
t2.setPriority(t2.getPriority()+3);
t1.start();
t2.start();
}
}