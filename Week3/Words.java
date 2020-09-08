/**
 * Main class of the Java program.
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World");
        ArrayList<String> words = new ArrayList<String>();
        
        Scanner input = new Scanner(System.in); 
  
        String word = "";
        
        System.out.println("Please enter 10 words");

        for (int i = 0; i < 10; i++){//input of 10 words
            System.out.println("Enter <Word> number: " + (i+1));
            word = input.next(); 
            words.add(word);
        }
        
        ArrayList<String> newWords = new ArrayList<String> ();//creating new array, so we do not have to mutate the original
  
        System.out.println("Now we have a list of words: " + words + " and it's size " + words.size() );
        
        System.out.println("Please enter a letter");
        char letter = input.next().toUpperCase().charAt(0);
        System.out.println("the letter you have entered: " + letter);
        int iterLimit = words.size();
        for (int i = 0; i < iterLimit; i++){
            if (words.get(i).charAt(0) != letter){
                newWords.add(words.get(i));
            }
        }
        
        System.out.println("after removal we have: " + newWords + " with size " + newWords.size());
    
    }
}
