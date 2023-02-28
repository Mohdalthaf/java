import java.io.DataInputStream;
import java.nio.channels.NonWritableChannelException;

class OverridingTeacherStudent{
    public static void main(String args[]){
        try{
        int choice=0;
        while(choice!=5){
        System.out.println("1.Teacher Details on Parent Class 2. Student Details on Parent Class 3. Teacher Details Overriding. 4. Student Details Overriding.");
        System.out.println("Enter Your choice");
        DataInputStream dis=new DataInputStream(System.in);
        choice=Integer.parseInt(dis.readLine());
        switch(choice){
            case 1:{
                School s=new School();
                s.teacher();
                break;
            }
            case 2:{
                School s=new School();
                s.students();
                break;
            }
            case 3:{
                Department d=new Department();
                d.teacher();
                break;

            }
            case 4:{
                Department d=new Department();
                d.students();
                break;

            }
            case 5:{
                break;
            }
            default:{
                System.out.println("Wrong choice");
            }
        }
    }
    }
    catch(Exception e){
        System.out.println(e);
    }
}
}
class School{
    void teacher(){
        System.out.println("Name : althaf");
        System.out.println("Department : Computer Science");
        System.out.println("Qualification : MCA");
        System.out.println("Assistant Professor");
        System.out.println("Phone: 3433564366");
    }
    void students(){
        System.out.println("Name : lemin");
        System.out.println("Department : Computer Science");
        System.out.println("Qualification : BCA");
        System.out.println("Student");
        System.out.println("Phone: 8766787867");
    }
}
class Department extends School{
    void teacher(){
        System.out.println("Name : Ahmad");
        System.out.println("Department : Commerse");
        System.out.println("Qualification : M-com");
        System.out.println("Assistant Professor");
        System.out.println("Phone: 3433345366");
    }
    void students(){
        System.out.println("Name : reyvanth");
        System.out.println("Department : Commerse");
        System.out.println("Qualification : B-com");
        System.out.println("Student");
        System.out.println("Phone: 8766345667");
    }
}