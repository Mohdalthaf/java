//Write a program to implement various methods of a StringBuffer class.

package networks;
import java.io.*;
public class StrBuffer {
public static void main(String args[]){ 
StringBuffer sb=new StringBuffer("hai"); 
System.out.println(sb.capacity());
sb.append("Arya");
System.out.println(sb);
System.out.println(sb.capacity());
sb.append("Jagish"); 
System.out.println(sb.capacity());
sb.insert(5,"JAVA123");
System.out.println(sb);
sb.replace(1,3,"JAVA"); 
System.out.println(sb);
sb.delete(0,7); 
System.out.println(sb);
sb.reverse(); 
System.out.println(sb);
} }