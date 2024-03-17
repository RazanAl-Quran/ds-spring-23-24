// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    Car myCar = new Car("Toyota", "Camry", 2020);
     System.out.println(myCar);
    // Access the properties of the car
    System.out.println("Make: " + myCar.getMake());
    System.out.println("Model: " + myCar.getModel());
    System.out.println("Year: " + myCar.getYear());
   
  }
}
