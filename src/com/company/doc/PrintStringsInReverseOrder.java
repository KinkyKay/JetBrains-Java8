package com.company.doc;

import java.util.Scanner;

public class PrintStringsInReverseOrder {
    /** Write a program that reads three strings and outputs them in the reverse
     *  order, each in a new line
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word1 = scanner.next();
        String word2 = scanner.next();
        String word3 = scanner.next();
        System.out.println(word3);
        System.out.println(word2);
        System.out.println(word1);
    }
}