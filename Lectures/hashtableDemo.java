package Lectures;
import java.util.HashMap;
import java.util.Map;

public class hashtableDemo {
    public static void main(String[] args) {

        System.out.println("\tMAP DEMO:");

        
        Map<String, String> phoneBook = new HashMap<String,String>();
 
        phoneBook.put("Johnny Walker", "2178");
        phoneBook.put("Andrew Arnold", "1298");
        phoneBook.put("Ivy Briggs", "1877");
        phoneBook.put("Ricky McBright", "2001");
        
        System.out.println("the follwing is a print of the hashable:");
        System.out.println(phoneBook);
        
        System.out.println("two valid keys:");
        System.out.println(phoneBook.get("Johnny Walker"));
        System.out.println(phoneBook.get("Ivy Briggs"));
        System.out.println("invalid key:");
        System.out.println(phoneBook.get("Unknown Friend"));
        
        //checks if map contains key - expected result true:
        System.out.println("expected true: ");
        System.out.println(phoneBook.containsKey("Johnny Walker"));
        //checks if main contains key - expected result false:
        System.out.println("expected false: ");
        System.out.println(phoneBook.containsKey("Unknown Friend"));
 
        //prints out all the keys
        System.out.println(phoneBook.keySet());
        //prints out the values
        System.out.println(phoneBook.values());
        
        //size of keys
        System.out.println(phoneBook.size());
        
        //demos removing the key
        phoneBook.remove("Andrew Arnold");
        
        //print out the new map
        System.out.println(phoneBook);
    }
}
