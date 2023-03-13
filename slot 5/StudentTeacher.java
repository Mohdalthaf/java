import java.io.*;

class Student
{
    int sno;
    String sname;
    String scourse;
    void read()
    {
        try
        {
            System.out.println();
            DataInputStream dis = new DataInputStream(System.in);
            System.out.print("Enter the student number : ");
            sno=Integer.parseInt(dis.readLine());
            System.out.print("Enter the student name : ");
            sname=dis.readLine();
            System.out.print("Enter the student course : ");
            scourse=dis.readLine();
            System.out.println();
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
    void show()
    {
        System.out.println();
        System.out.println("Student Details");
        System.out.println("------------------");
        System.out.println("Student Number : " + sno);
        System.out.println("Student Name : " + sname);
        System.out.print("Student Course : " + scourse);
        System.out.println();
    }
}

class Teacher extends Student
{
    int tno;
    String tname;
    float tsal;
    void read()
    {
        try
        {
            System.out.println();
            DataInputStream dis = new DataInputStream(System.in);
            System.out.print("Enter the teacher number : ");
            tno=Integer.parseInt(dis.readLine());
            System.out.print("Enter the teacher name : ");
            tname=dis.readLine();
            System.out.print("Enter the teacher salary : ");
            tsal=Float.parseFloat(dis.readLine());
            System.out.println();
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
    void show()
    {
        System.out.println();
        System.out.println("Teacher Details");
        System.out.println("------------------");
        System.out.println("Teacher Number : " + tno);
        System.out.println("Teacher Name : " + tname);
        System.out.println("Teacher Salary : " + tsal);
        System.out.println();
    }
}

public class StudentTeacher
{
    public static void main(String[] args)
    {
        DataInputStream dis = new DataInputStream(System.in);
        Student s = new Student();
        Student t = new Teacher();
        int ch;
        try
        {
            do
            {
                System.out.println();
                System.out.println("MENU");
                System.out.println("***********");
                System.out.println("1. Read Student Details");
                System.out.println("2. Read Teacher Details");
                System.out.println("3. Display Student Details");
                System.out.println("4. Display Teacher Details");
                System.out.println("5. Exit");
                System.out.println("Enter your choice (1-5) : ");
                ch = Integer.parseInt(dis.readLine());
                switch(ch)
                {
                    case 1: s.read();
                            break;
                    case 2: t.read();
                            break;
                    case 3: s.show();
                            break;
                    case 4: t.show();
                            break;
                    case 5: System.out.println(" Exiting......");
                            break;
                    default: System.out.println("Enter a Valid Choice..........");
                            break;
                }
            }while(ch!=5);
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}