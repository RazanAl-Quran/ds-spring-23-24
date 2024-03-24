// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
    public static void main(String[] args) {
      // System.out.println("Hello world!");
      String str = "Hello, World!";
       System.out.println(str);
      // Example of methods provided by the String ADT
  
      // 1. length(): Returns the length of the string
      int length = str.length();
      System.out.println("Length of the string: " + length);
  
      // 2. charAt(index): Returns the character at the specified index
      char firstChar = str.charAt(0);
      System.out.println("First character of the string: " + firstChar);
  
      // 3. substring(beginIndex): Returns a substring from the specified index to the end of the string
      String substring1 = str.substring(7);
      System.out.println("Substring from index 7: " + substring1);
  
      // 4. substring(beginIndex, endIndex): Returns a substring from the specified begin index (inclusive) to the specified end index (exclusive)
      String substring2 = str.substring(7, 12);
      System.out.println("Substring from index 7 to 12: " + substring2);
  
      // 5. indexOf(str): Returns the index within the string of the first occurrence of the specified substring
      int indexOfWorld = str.indexOf("World");
      System.out.println("Index of 'World' in the string: " + indexOfWorld);
  
      // 6. toUpperCase(): Converts all characters in the string to uppercase
      String upperCaseStr = str.toUpperCase();
      System.out.println("Uppercase string: " + upperCaseStr);
  
      // 7. toLowerCase(): Converts all characters in the string to lowercase
      String lowerCaseStr = str.toLowerCase();
      System.out.println("Lowercase string: " + lowerCaseStr);
  
      // 8. equals(str): Compares this string to another string
      boolean isEqual = str.equals("Hello, World!");
      System.out.println("Is the string equal to 'Hello, World!': " + isEqual);
  
      // 9. contains(str): Checks whether the string contains a specified substring
      boolean containsHello = str.contains("Hello");
      System.out.println("Does the string contain 'Hello': " + containsHello);
  
      // 10. replace(oldChar, newChar): Replaces all occurrences of a specified character with another character
      String replacedStr = str.replace('o', '0');
      System.out.println("String after replacement: " + replacedStr);
  
    }
  }