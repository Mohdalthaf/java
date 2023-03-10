import java.io.*;
import java.lang.*;
class Bounded_Avg
{
public static <E extends Number> double avgArray(E[] array)
{
double sum=0.0,a;
int c=0;
for(E element:array)
{
sum=sum+element.doubleValue();
c=c+1;
}
return (sum/c);
}
public static void main(String args[])
{

double r1,r2;
Integer[] Intarray={4,6,8};
Double[] dbarray={4.1,6.2};
r1=avgArray(Intarray);
r2=avgArray(dbarray);
if(r1>r2)
{
System.out.println(r1+" is Larger than "+r2);
}
else if(r2>r1)
{
System.out.println(r2+" is Larger than "+r1);
}
else if(r1==r2)
{
System.out.println(r1+" and "+r2+" is equal");
}
else
{
System.out.println(r1+" and "+r2+" is not equal");
} } }