import java.io.*;
import java.lang.*;
class Even{
    static void display(int n)
    {
        for(int i=2;i<=n;i+=2)
        {
            System.out.println(i);
        }
    }
}
class EvenDisp
{
    public static void main(String[] args) {
       try{
        
        DataInputStream dis=new DataInputStream(System.in);
        int n;
        System.out.println("Enter value for n:");
        n=Integer.parseInt(dis.readLine());
        System.out.println("Even numbers upto "+n+" are ");
        Even.display(n);
        
       }
       catch(IOException e)
       {
            System.out.println(e);
       }
    }
}