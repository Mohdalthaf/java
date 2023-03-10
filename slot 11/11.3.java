//Write a program to implement a Generic class, and display the types of various parameters passed.

import java.io.*;
import java.lang.*;
class GenClass<t1,t2>
{
public void disp(t1 var1,t2 var2)
{
System.out.println("The datatype of "+var1+" is : "+var1.getClass());
System.out.println("The datatype of "+var2+" is : "+var2.getClass());
} }
class GenericParameter
{
public static void main(String args[])
{

GenClass<Double,Integer> obj1=new GenClass<Double,Integer>();
obj1.disp(1.1,1);
GenClass<String,Integer> obj2=new GenClass<String,Integer>();
obj2.disp(new String("Hello"),1);
} }