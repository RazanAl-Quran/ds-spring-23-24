public class Car {
  
  private String make;
  private String model;
  private int year;

// Constructor with parameters
public Car(String make, String model, int year) {
    this.make = make;
    this.model = model;
    this.year = year;
}

// Getter methods
public String getMake() {
    return make;
}

public String getModel() {
    return model;
}

public int getYear() {
    return year;
}
}