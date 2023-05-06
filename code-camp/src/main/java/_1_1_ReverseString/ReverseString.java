/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _1_1_ReverseString;

import java.util.List;
import java.util.Scanner;
import java.util.Stack;
import java.util.stream.Collectors;

/**
 *
 * @author kdore
 */
public class ReverseString {
    /** INSTRUCTIONS
     * - Implement as many ways of reversing a string as you can come up with.
     * - Try to come up with a solution yourself first,
     *   you can use google as a resource to figure out syntax, but avoid full solutions.
     * - If you have an idea, but cannot figure out how to implement it,
     *   write out your thoughts in pseudo-code comments
     */
    
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
        long startTime = System.nanoTime();
        
        // TODO: implement reversal
 
        // TODO: change this line to print reversed string
        //System.out.println("result - " + reverseString);
 
        long endTime = System.nanoTime();
        System.out.println("reverse1 - " + (endTime - startTime));
    }
    
    public static void reverse2 (String inStr) {
        long startTime = System.nanoTime();
        
        // TODO: implement reversal
        
        // TODO: change this line to print reversed string
        //System.out.println("result - " + reverseString);
 
        long endTime = System.nanoTime();
        System.out.println("reverse2 - " + (endTime - startTime));
    }
    
    public static void reverse3 (String inStr) { 
        long startTime = System.nanoTime();
        
        // TODO: implement reversal
        
        // TODO: change this line to print reversed string
        //System.out.println("result - " + reverseString);
 
        long endTime = System.nanoTime();
        System.out.println("reverse3 - " + (endTime - startTime));
    }
    
    public static void reverse4 (String inStr) { }
}
