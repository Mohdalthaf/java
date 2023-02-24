import java.io.*;

class Engine implements Serializable {
  private static final long serialVersionUID = 1L;
  private String type;

  public Engine(String type) {
    this.type = type;
  }

  public String getType() {
    return type;
  }
}

class Vehicle implements Serializable {
  private static final long serialVersionUID = 1L;
  private String model;
  private Engine engine;

  public Vehicle(String model, Engine engine) {
    this.model = model;
    this.engine = engine;
  }

  public String getModel() {
    return model;
  }

  public Engine getEngine() {
    return engine;
  }
}

public class hasaSerialization {
  public static void main(String[] args) {
    Engine engine = new Engine("Petrol");
    Vehicle vehicle = new Vehicle("Maruti Swift", engine);

    // Serialization
    try {
      FileOutputStream fileOut = new FileOutputStream("vehicle.ser");
      ObjectOutputStream out = new ObjectOutputStream(fileOut);
      out.writeObject(vehicle);
      out.close();
      fileOut.close();
      System.out.println("Vehicle object serialized to vehicle.ser");
    } catch (IOException e) {
      e.printStackTrace();
    }

    // Deserialization
    Vehicle deserializedVehicle = null;
    try {
      FileInputStream fileIn = new FileInputStream("vehicle.ser");
      ObjectInputStream in = new ObjectInputStream(fileIn);
      deserializedVehicle = (Vehicle) in.readObject();
      in.close();
      fileIn.close();
    } catch (IOException e) {
      e.printStackTrace();
      return;
    } catch (ClassNotFoundException e) {
      System.out.println("Vehicle class not found");
      e.printStackTrace();
      return;
    }

    // Verify the deserialized object
    System.out.println("Deserialized Vehicle Object:");
    System.out.println("Model: " + deserializedVehicle.getModel());
    System.out.println("Engine Type: " + deserializedVehicle.getEngine().getType());
  }
}
