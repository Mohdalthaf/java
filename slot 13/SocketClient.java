package JavaClass;
import java.net.*;
import java.io.*;

public class SocketClient{
    public static void main(String args[]){
        try{
            Socket s = new Socket("localhost",1214);  //adrdess, port number
            System.out.println("Sending a request to Server");
            DataOutputStream dout= new DataOutputStream(s.getOutputStream());
            dout.writeUTF("Hello");


        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}