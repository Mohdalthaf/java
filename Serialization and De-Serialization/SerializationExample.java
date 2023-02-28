import java.io.*;

class Student implements Serializable {
  private static final long serialVersionUID = 1L;
  private int id;
  private String name;

  public Student(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }
}

public class SerializationExample {
  public static void main(String[] args) {
    Student student = new Student(123, "John Doe");

    // Serialization
    try {
      FileOutputStream fileOut = new FileOutputStream("student.ser");
      ObjectOutputStream out = new ObjectOutputStream(fileOut);
      out.writeObject(student);
      out.close();
      fileOut.close();
      System.out.println("Student object serialized to student.ser");
    } catch (IOException e) {
      e.printStackTrace();
    }

    // Deserialization
    Student deserializedStudent = null;
    try {
      FileInputStream fileIn = new FileInputStream("student.ser");
      ObjectInputStream in = new ObjectInputStream(fileIn);
      deserializedStudent = (Student) in.readObject();
      in.close();
      fileIn.close();
    } catch (IOException e) {
      e.printStackTrace();
      return;
    } catch (ClassNotFoundException e) {
      System.out.println("Student class not found");
      e.printStackTrace();
      return;
    }

    // Verify the deserialized object
    System.out.println("Deserialized Student Object:");
    System.out.println("ID: " + deserializedStudent.getId());
    System.out.println("Name: " + deserializedStudent.getName());
  }
}