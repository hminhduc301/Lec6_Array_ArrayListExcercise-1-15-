package Lec6_Array;

import java.util.Scanner;

public class Ex12_CharacterFrequencyArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string of lowercase English letters: ");
        String input = scanner.nextLine();
        
        int[] freq = new int[26];
        
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c >= 'a' && c <= 'z') {
                freq[c - 'a']++;
            }
        }
        
        System.out.println("Output:");
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                char character = (char) ('a' + i);
                System.out.println(character + ": " + freq[i]);
            }
        }
        
        scanner.close();
    }
}
