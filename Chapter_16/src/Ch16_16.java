import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ch16_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text;
        System.out.println("Enter a sentence: ");
        text=input.nextLine();

        Set<String> duplicates = duplicateWords(text);
        System.out.println("Duplicates: " + duplicates); }

        public static Set<String> duplicateWords(String input){
        if(input == null || input.isEmpty()){
            return Collections.emptySet();
        }
        Set<String> duplicates = new HashSet<>();
        String[] words = input.split("\\s+");
        Set<String> set = new HashSet<>();
        int counter=0;
        for(String word : words){
            if(!set.add(word.toLowerCase())){
                duplicates.add(word);
                counter++;} }
        System.out.println("Number of duplicated words: " + counter);
        return duplicates; }

}


