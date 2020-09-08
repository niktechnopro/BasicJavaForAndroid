/**
 * Exercise 1 - Find Duplicates
 * Find duplicate values of an array and remove them. Then, print the new array without the duplicated values.
 */
import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> computerBrands = new ArrayList<>();
        ArrayList<String> brandsWithNoDuplicates = new ArrayList<>();
        
        computerBrands.add("Apple");
        computerBrands.add("Acer");
        computerBrands.add("Samsung");
        computerBrands.add("Asus");
        computerBrands.add("Sony");
        computerBrands.add("Dell");
        computerBrands.add("Hewlett-Packard");
        computerBrands.add("Asus");
        computerBrands.add("Apple");
        computerBrands.add("Acer");
        computerBrands.add("Toshiba");
        computerBrands.add("Sony");
        computerBrands.add("Samsung");
        
        System.out.println(computerBrands);
        //clone array
        String currentElement = "";
        //let's iterate through array with 2 loops
        ArrayList<String> notDuplicate = new ArrayList<>();;
        for (int i=0; i<computerBrands.size(); i++){
           currentElement = computerBrands.get(i);
           int v = 0;
           for (int b=0; b<i; b++){
               if(computerBrands.get(b).equals(currentElement)){
                   v++;
               }
           }
           if(v < 1) notDuplicate.add(currentElement);
        }
        
        System.out.println(notDuplicate);
    }
}
