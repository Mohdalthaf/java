import java.io.*;
import java.lang.*;
class abc extends Thread
{
    String nm;
    abc(String name)
    {
        nm=name;
    }
    public void run()
    {
        System.out.println("runing "+nm);
       try
        {
            for(int i=0;i<5;i++)
            {
                System.out.println(nm+" "+i);
                Thread.sleep(100);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
    }
}
class threadcreation
{
    public static void main(String args[])
    {
        abc a=new abc("a");
        a.start();
    }
}