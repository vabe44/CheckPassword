package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Enter your password: ");
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        scanner.close();

        boolean isAtLeast8 = AtLeast8(password);
        boolean isLetterDigit = LetterOrDigit(password);
        boolean isAtLeast2Digits = AtLeast2Digits(password);

        if (isAtLeast8 && isLetterDigit && isAtLeast2Digits) System.out.println("Valid password");
        else System.out.println("Invalid password");
    }

    public static boolean AtLeast8(String p) {
        return p.length() >= 8;
    }

    public static boolean LetterOrDigit(String p) {
        for (int i=0; i<p.length(); i++) {
            if (!Character.isLetterOrDigit(p.charAt(i))) return false;
        }
        return true;
    }

    public static boolean AtLeast2Digits(String p) {
        Integer count = 0;

        for (int i=0; i<p.length(); i++) {
            if (Character.isDigit(p.charAt(i))) count++;
            if (count >= 2) return true;
        }
        return false;
    }
}
