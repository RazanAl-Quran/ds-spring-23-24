// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
    public static void main(String[] args) {
      // Question: A string s is a circular rotation of a string t if it matches when the characters are circularly shifted by any number of positions; e.g., ACTGACG is a circular shift of TGACGAC, and vice versa. Detecting this condition is important in the study of genomic sequences. Write a program that checks whether two given strings s and t are circular shifts of one another. 
  
      System.out.println(isCircularShift("ACTGACG", "TGACGAC")); //true
      System.out.println(isCircularShift("ACTGACG", "TGACACC")); //false
  
    }
  
     public static boolean isCircularShift(String s, String t) {
       // using string methods
      // if (s.length() != t.length()) { return false; }
      // String concatenateS = s.concat(s);
      // return concatenateS.contains(t); 
  
       // without string methods >> credit goes to Hamza AlBanna - Student in Data Structure course Section 01
       String temp = s;
       for (int i = 0; i < temp.length(); i++){
           char c = temp.charAt(0);
           temp += c;
           temp = temp.substring(1);
           if (temp.equals(t)){
               return true;
           }
       }
       return false;
    }
  }F