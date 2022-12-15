import java.io.*;
import java.lang.*;
class test
{
    public int multiply(int x,int y)
    {
        int a;
        a=x*y;
        return a;
    }
}
class functiondemo
{
    public static void main(String args[])
    {
        int x,y,c;
        DataInputStream ob=new DataInputStream(System.in);
        try
        {
            System.out.println("Enter the x:");
            x=Integer.parseInt(ob.readLine());

            System.out.println("Enter the y:");
            y=Integer.parseInt(ob.readLine());

            test t=new test();
            c=t.multiply(x,y);

            System.out.println("Product="+c);

        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}