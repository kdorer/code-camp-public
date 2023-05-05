/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _1_1_RreverseString;

import java.util.List;
import java.util.Scanner;
import java.util.Stack;
import java.util.stream.Collectors;

/**
 *
 * @author kdore
 */
public class ReverseString {
    
    // abcdef
    // racecar
    // 0123456789
    // 000111222333444555666777888999
    
    public static void main (String[] args) {
   
        Scanner sc = new Scanner(System. in );
        boolean exitFlag = false;

        while (!exitFlag) {
            System.out.println("---- START ----");
            System.out.print("Enter a string to be reversed: ");
            String inputStr = sc.next();
            
            reverse1(inputStr);
            reverse2(inputStr);
            reverse3(inputStr);
        
            System.out.print("Would you like to continue (y/n)? ");
            String input = sc.next();
            if ("n".equals(input)) {
                exitFlag = true;
            } else if ("y".equals(input)) {
                exitFlag = false;
            }
            System.out.println("---- END ----");
        }
    }
    
    public static void reverse1 (String inStr) {
        // StringBuilder / StringBuffer
        long startTime = System.nanoTime();
        
        StringBuilder builder = new StringBuilder();
        builder.append(inStr).reverse();
        
        long endTime = System.nanoTime();
        
        System.out.println("reverse1 - " + builder + " - " + (endTime - startTime));
    }
    
    public static void reverse2 (String inStr) {
        // for loop
        long startTime = System.nanoTime();
        
        String revStr = "";
        
        int lastChar = inStr.length() - 1;
        
        for (int i = lastChar; i > -1; i--) {
            revStr += inStr.charAt(i);
        }
        
        long endTime = System.nanoTime();
        System.out.println("reverse2 - " + revStr + " - " + (endTime - startTime));
    }
    
    public static void reverse3 (String inStr) { 
        // stack
        long startTime = System.nanoTime();
        
        List<Character> charList = inStr.chars().mapToObj(e -> (char)e).collect(Collectors.toList());
        
        Stack<Character> stack = new Stack<>();
        
        for (Character c : charList) {
            stack.push(c);
        }
        
        String rev = "";
        while (!stack.isEmpty()) {
            rev += stack.pop();
        }
        
        long endTime = System.nanoTime();
        System.out.println("reverse3 - " + rev + " - " + (endTime - startTime));
    }
    
    public static void reverse4 (String inStr) { }
}
