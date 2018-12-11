package com.shreyannag;
import java.util.Scanner;
public class vowel_consonant_split {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence : ");
        String str = sc.nextLine();
        char chr[] = str.trim().toLowerCase().toCharArray();
        StringBuffer vowel = new StringBuffer();
        StringBuffer consonant = new StringBuffer();
        for(int i=0;i<chr.length;i++)
            switch (chr[i]) {
                case 'a':
                    vowel.append(chr[i]);
                    break;
                case 'e':
                    vowel.append(chr[i]);
                    break;
                case 'i':
                    vowel.append(chr[i]);
                    break;
                case 'o':
                    vowel.append(chr[i]);
                    break;
                case 'u':
                    vowel.append(chr[i]);
                    break;
                default:
                    consonant.append(chr[i]);
            }
        System.out.println("The vowels are : "+vowel);
        System.out.println("\nThe consonants are : "+consonant);
    }
}