import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.LinkedList;
// import static org.junit.jupiter.api.Assertions.assertEquals;
// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");

    //Initialization
    // Array
    String[] friendsArray = new String[4];
    String[] friendsArray2 = {"Jim", "Jack", "Jill", "Joe"};
    // ArrayList
    ArrayList<String> friendsArrayList= new ArrayList<>();
    ArrayList<String> friendsArrayList2= new ArrayList<String>(Arrays.asList("Jim", "Jack","Jill", "Joe"));
    // ArrayList can only hold objects but supports wrapper types for primitive
    // types
    // Note: use the below line is better bcz we can change the type of
    // implementation easily
    List<String> friendsArrayList3= new ArrayList<String>();

    // Get Elements
    // Array
    System.out.println(friendsArray2[2]);
    // ArrayList
    System.out.println(friendsArrayList2.get(2));

    // Get the Size
    // Array
    System.out.println(friendsArray2.length);
    // ArrayList
    System.out.println(friendsArrayList2.size());

    // add element to the end
    // Array
    // we can't do that with arrays
    // ArrayList
    friendsArrayList2.add("Jane");
    System.out.println(friendsArrayList2.get(4));

    // set an element in an index
    // Array
    friendsArray2[0]= "Jimmy";
    // ArrayList
    friendsArrayList2.set(0, "Jimmy");

    // Remove element
    // Array
    // we can't do that with arrays
    // ArrayList
    friendsArrayList2.remove(0); // or friendsArrayList2.remove("Jimmy");

    // Print
    // Array
    System.out.println(friendsArray2); //for loop
    // ArrayList
    System.out.println(friendsArrayList2);

   
    
  }

}