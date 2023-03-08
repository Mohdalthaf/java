package JavaClass;

import java.net.*;
import java.io.*;
public class SocketServer{
    public static void main(String args[]){
        try{
        ServerSocket ss = new ServerSocket(1214);
        System.out.println("Waiting for a Connection from 1214");
        Socket as=ss.accept();
        System.out.println("Made Connection");
        DataInputStream dis = new DataInputStream(as.getInputStream());
        String str = (String)dis.readUTF();
        System.out.println("The Message is : "+str);
        }
        catch(Exception e){
            System.out.println(e);
        }

    }
}