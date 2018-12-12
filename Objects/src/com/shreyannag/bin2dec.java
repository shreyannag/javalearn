package com.shreyannag;

import java.util.*;

public class bin2dec {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter binary: ");
        String num = sc.next();
        char n1[] = num.toCharArray();
        int i;
        int n2[] = new int[10];
        for (i = 0; i <= n1.length; i++) {
            n2[i] = Character.getNumericValue(n1[i]) * (int) (Math.pow(2.0, (double) i));
        }
        for (i = 0; i <= n1.length; i++) {
            System.out.println("The decimal is " + n2[i]);
        }
    }
}
