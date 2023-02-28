import java.io.*;

class Vehicle implements Serializable {
  private static final long serialVersionUID = 1L;
  private String model;

  public Vehicle(String model) {
    this.model = model;
  }

  public String getModel() {
    return model;
  }
}

class Maruti extends Vehicle {
  private static final long serialVersionUID = 1L;
  private int year;

  public Maruti(String model, int year) {
    super(model);
    this.year = year;
  }

  public int getYear() {
    return year;
  }
}

public class SerializationCar {
  public static void main(String[] args) {
    Maruti maruti = new Maruti("Swift", 2021);

    // Serialization
    try {
      FileOutputStream fileOut = new FileOutputStream("maruti.ser");
      ObjectOutputStream out = new ObjectOutputStream(fileOut);
      out.writeObject(maruti);
      out.close();
      fileOut.close();
      System.out.println("Maruti object serialized to maruti.ser");
    } catch (IOException e) {
      e.printStackTrace();
    }

    // Deserialization
    Maruti deserializedMaruti = null;
    try {
      FileInputStream fileIn = new FileInputStream("maruti.ser");
      ObjectInputStream in = new ObjectInputStream(fileIn);
      deserializedMaruti = (Maruti) in.readObject();
      in.close();
      fileIn.close();
    } catch (IOException e) {
      e.printStackTrace();
      return;
    } catch (ClassNotFoundException e) {
      System.out.println("Maruti class not found");
      e.printStackTrace();
      return;
    }

    // Verify the deserialized object
    System.out.println("Deserialized Maruti Object:");
    System.out.println("Model: " + deserializedMaruti.getModel());
    System.out.println("Year: " + deserializedMaruti.getYear());
  }
}
