import java.io.*;

class Employee implements Serializable {
  private static final long serialVersionUID = 1L;
  private int id;
  private String name;
  private String department;
  private transient double salary; // transient field will not be serialized

  public Employee(int id, String name, String department, double salary) {
    this.id = id;
    this.name = name;
    this.department = department;
    this.salary = salary;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getDepartment() {
    return department;
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  private void writeObject(ObjectOutputStream out) throws IOException {
    out.defaultWriteObject(); // default serialization
    out.writeDouble(salary); // manual serialization of transient field
  }

  private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
    in.defaultReadObject(); // default deserialization
    salary = in.readDouble(); // manual deserialization of transient field
  }
}

public class EmployeeSerialization {
  public static void main(String[] args) {
    Employee employee = new Employee(1, "John Doe", "Engineering", 50000.0);
    employee.setSalary(60000.0);

    // Serialization
    try {
      FileOutputStream fileOut = new FileOutputStream("employee.ser");
      ObjectOutputStream out = new ObjectOutputStream(fileOut);
      out.writeObject(employee);
      out.close();
      fileOut.close();
      System.out.println("Employee object serialized to employee.ser");
    } catch (IOException e) {
      e.printStackTrace();
    }

    // Deserialization
    Employee deserializedEmployee = null;
    try {
      FileInputStream fileIn = new FileInputStream("employee.ser");
      ObjectInputStream in = new ObjectInputStream(fileIn);
      deserializedEmployee = (Employee) in.readObject();
      in.close();
      fileIn.close();
    } catch (IOException e) {
      e.printStackTrace();
      return;
    } catch (ClassNotFoundException e) {
      System.out.println("Employee class not found");
      e.printStackTrace();
      return;
    }

    // Verify the deserialized object
    System.out.println("Deserialized Employee Object:");
    System.out.println("ID: " + deserializedEmployee.getId());
    System.out.println("Name: " + deserializedEmployee.getName());
    System.out.println("Department: " + deserializedEmployee.getDepartment());
    System.out.println("Salary: " + deserializedEmployee.getSalary());
  }
}
