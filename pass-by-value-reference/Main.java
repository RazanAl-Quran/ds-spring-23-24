// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {
    // passing by value
    System.out.println("*********");
    int x=5;
    System.out.println(x);
    int y=x;
    System.out.println(y);
    x=6;
    System.out.println(x);
    System.out.println(y);

    // passing by reference
    System.out.println("*********");
    int[] myNum = {10, 20, 30, 40};
    int[] myNum2 = myNum;
    myNum[2]=33;
    System.out.println(myNum2[2]);

  }
}