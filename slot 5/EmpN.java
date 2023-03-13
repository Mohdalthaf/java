import java.io.*;
import java.util.*;
class Employee
{
    String ename;
    int esal,eno;
    DataInputStream dis=new DataInputStream(System.in);
    void read(Employee e)
    {
        try
        {
            System.out.println("Enter the employee number:");
            e.eno=Integer.parseInt(dis.readLine());
            System.out.println("Enter the employee name:");
            e.ename=dis.readLine();
            System.out.println("Enter the employee salary:");
            e.esal=Integer.parseInt(dis.readLine());
        }
        catch(IOException ex)
        {
            System.out.println(ex);
        }
    }
    void display(Employee e)
    {
        System.out.println(" Employee No.: "+e.eno+"\n Employee Name: "+e.ename+"\n Employee Salary: "+e.esal);
    }
}
class EmpN
{
    public static void main(String args[])
    {
        try
        {
            int n,i;
            char ch;
            DataInputStream dis=new DataInputStream(System.in);
            System.out.println("Enter the number of employees:");
            n=Integer.parseInt(dis.readLine());
            Employee e[]=new Employee[n];
            for(i=0;i<n;i++)
            {
                e[i]=new Employee();
                System.out.println();
                System.out.print("Enter details of employee"+(i+1)+"\n");
                System.out.println("-------------------------");
                e[i].read(e[i]);
            }
            for(i=0;i<n;i++)
            {
                System.out.println();
                System.out.println("Employee"+(i+1)+"\n-------------------------");
                e[i].display(e[i]);
                System.out.println("-------------------------");
            }
            do
            {
                Scanner sc=new Scanner(System.in);
                System.out.print("Would you like to search for an employee ?? Enter Y for yes and N for no : ");
                ch = sc.next().charAt(0);
                System.out.println();
                if(ch=='Y'||ch=='y')
                {
                    int flag=0,search;
                    System.out.print("Enter the employee number to search:");
                    //search=Integer.parseInt(dis.readLine());
                    search=sc.nextInt();
                    System.out.println();
                    for(i=0; i<n; i++)
                    {
                        if(e[i].eno==search)
                        {
                            flag++;
                            System.out.println("Employee Found ");
                            System.out.println("Employee Number : " +e[i].eno);
                            System.out.println("Employee Name : " +e[i].ename);
                            System.out.println("Employee Salary : " +e[i].esal);
                            System.out.println();
                            break;
                        }
                    }
                    if(flag==0)
                        System.out.println("Employee Not Found");
                        System.out.println();
                }
                else if(ch=='N'||ch=='n')
                {
                    System.out.println("Exiting......");
                    break;
                }
                else
                {
                    System.out.println("Enter a Valid Choice");
                    System.out.println();
                }
            }while(ch!='N'||ch!='n');
        }
        catch(IOException ex)
        {
            System.out.println(ex);
        }
    }
}