package com.shreyannag;
import java.util.*;
public class wordpattern {
    public static void main(String[] args) {
        int i,j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        String str = sc.next();
        for(i=0;i<str.length();i++)
        {
            for(j=0;j<=i;j++)
            {
                System.out.print(str.charAt(j));
            }
            System.out.println(" ");
        }

    }
}
