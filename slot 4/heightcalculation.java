import java.io.*;
class heightcalculation{
    public static void main(String args[]){
        Height h1=new Height();
        h1.read();
        h1.display();
        Height h2=new Height();
        h2.read();
        h2.display();

    }
}
class Height{
    int foot;
    int inch;
    public void read(){
        try{
            DataInputStream dis= new DataInputStream(System.in);
            System.out.println("Enter the foot");
            foot=Integer.parseInt(dis.readLine());
            System.out.println("Enter the inches");
            inch=Integer.parseInt(dis.readLine());
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
    public void display(){
        System.out.println(foot+" Foot and "+inch+" inches");
    }
    public void add(){
        Height h1=new Height();
    }
}