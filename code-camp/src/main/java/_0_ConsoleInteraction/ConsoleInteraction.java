/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _0_ConsoleInteraction;

import java.util.Scanner;

/**
 *
 * @author kdore
 */
public class ConsoleInteraction {
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System. in );
        boolean exitFlag = false;

        while (!exitFlag) {
            System.out.println("This is a test. Exit? y/n");
            String input = sc.next();
            if ("y".equals(input)) {
                exitFlag = true;
            } else if ("n".equals(input)) {
                exitFlag = false;
            }
        }
    }
}
