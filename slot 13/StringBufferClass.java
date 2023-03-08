import java.util.*;

class StringBufferClass{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s,st,sr;
        
        
        System.out.println("Enter the String to be validated:");
        s=sc.nextLine();
        StringBuffer s1 = new StringBuffer(s);
        System.out.println(s1+" String length : "+s1.length());
        System.out.println("Enter the String which is to appended:");
        st=sc.nextLine();
        StringBuffer s2 = new StringBuffer(st);        
        System.out.println(s+" and "+s2+" Appended "+s1.append(s2));
        System.out.println("Reverse of String "+s1.reverse());
        s1.reverse();
        System.out.println("Enter the String to be replaced:");
        sr=sc.nextLine();
        System.out.println("Replaced String "+s1.replace(4,8,sr));
    }
}