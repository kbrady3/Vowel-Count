//Kabrina Brady

import java.util.Scanner;

public class VowelCountBrady {
    public static void main(String[] args) {
        String word;
        int vowel = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a word: ");
        word = input.next();

        for (int i = 0; i < word.length(); i++){
            char ch = word.charAt(i);
            if (ch == 'a'){
                vowel++;
            }
            if (ch == 'e'){
                vowel++;
            }
            if (ch == 'i'){
                vowel++;
            }
            if (ch == 'o'){
                vowel++;
            }
            if (ch == 'u'){
                vowel++;
            }
            if (vowel == 0){
                if (ch == 'y'){
                    vowel++;
                }
            }
        }
        if (vowel == 0){
            System.out.println("You have a typo.");
        }
        else{
            System.out.println("Number of vowels in " + word + ": " + vowel);
        }
    }
}