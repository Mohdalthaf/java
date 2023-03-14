import java.io.*;
class test
{
    void max(int x,int y)
    {
        int z,res;
        try
        {
            DataInputStream dis=new DataInputStream(System.in);
            System.out.println("Enter third number:");
            z=Integer.parseInt(dis.readLine());
            res=(x>y)?x:y;
            res=max1(res,z);
            System.out.println("Maximum of "+res);
        }
        catch(IOException ie)
        {
            System.out.println(ie);
        }
        
    }
    int max1(int a,int b)
    {
        int val;
        val=(a>b)?a:b;
        return val;
    }
}
public class NestedFn
{
    public static void main(String[] args) {
        try
        {
            DataInputStream dis=new DataInputStream(System.in);
            int x,y;
            System.out.println("Enter first number:");
            x=Integer.parseInt(dis.readLine());
            System.out.println("Enter second number:");
            y=Integer.parseInt(dis.readLine());
            test t=new test();
            t.max(x,y);
            
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}