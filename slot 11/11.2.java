// Write a program to implement a Generic method, which can display the elements of various arrays of different data types, and find the length of each array.import java.io.*;
import java.lang.*;
class class11_2
{
public static < E > void printArray(E[] array)
{
for(E element:array)
{
System.out.println(element);
} }
public static void main(String args[])
{
Integer[] intArray={1,2,3};
Double[] dbArray={1.1,1.2,1.3,1.4,1.5};
Character[] cArray={'a','r','y','a','j','a'};
String[] sArray={"g","h"};
printArray(intArray);
printArray(dbArray);
printArray(cArray);
printArray(sArray);
} }