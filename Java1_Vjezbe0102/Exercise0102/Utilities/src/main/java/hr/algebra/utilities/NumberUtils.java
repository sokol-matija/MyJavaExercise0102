/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hr.algebra.utilities;

/**
 *
 * @author daniel.bele
 */
public class NumberUtils {

    private static final char[] CONVERSION_TABLE = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    private NumberUtils() {
    }

    public static String convert(int number, int base) {
        // final restrictions
        if (number <= 0 || base <= 0 || base > CONVERSION_TABLE.length) {
            return "0";
        }
        StringBuilder result = new StringBuilder();
        while (number > 0) {
            result.insert(0, CONVERSION_TABLE[number % base]);
            number /= base;
        }
        return result.toString();
    }
}
