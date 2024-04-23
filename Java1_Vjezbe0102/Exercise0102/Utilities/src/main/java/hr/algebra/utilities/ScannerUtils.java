/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hr.algebra.utilities;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author daniel.bele
 */
public class ScannerUtils {

    private ScannerUtils() {
    }
    
    public static int readInt(String message, Scanner scanner) {
        System.out.print(message);
        while(!scanner.hasNextInt()) {
            System.out.print(message);
            scanner.nextLine(); // we have to clean up string from the stream!
        }
        int number = scanner.nextInt();
        scanner.nextLine();
        return number;
    }

    public static String readString(String message, Scanner scanner) {
        String line;
        do {
            System.out.print(message);
            line = scanner.nextLine().trim();
        } while (line.isEmpty());
        return line;
    }
    
    public static double readDouble(String message, Scanner scanner) {
        System.out.print(message);
        while(!scanner.hasNextDouble()) {
            System.out.print(message);
            scanner.nextLine(); // we have to clean up string from the stream!
        }
        double number = scanner.nextDouble();
        scanner.nextLine();
        return number;
    }
    
    public static String readString(String message, Scanner scanner, String...values) {
        String line;
        do {
            System.out.print(message);
            line = scanner.nextLine().trim();
        } while (line.isEmpty() || !Arrays.asList(values).contains(line));
        return line;
    }

    public static char readChar(String message, Scanner scanner) {
        return readString(message, scanner).charAt(0);
    }
    
}
