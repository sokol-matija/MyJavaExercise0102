package hr.algebra;

import hr.algebra.utilities.NumberUtils;
import static hr.algebra.utilities.ScannerUtils.readChar;
import static hr.algebra.utilities.ScannerUtils.readInt;
import java.util.Scanner;

public class Task02 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            char again;
            do {
                int number = readInt("Decimal number:", scanner);
                printNumberInFormatsManually(number);
                printNumberInFormats(number);
                again = readChar("Again (y/n): ", scanner);
            } while (again == 'y');

        }
    }

    private static void printNumberInFormatsManually(int number) {
        System.out.printf("Decade: %d%n", number);
        System.out.printf("Binary: %s%n", NumberUtils.convert(number, 2));
        System.out.printf("Octal: %s%n", NumberUtils.convert(number, 8));
        System.out.printf("Hexadecimal: %s%n", NumberUtils.convert(number, 16));
    }

    private static void printNumberInFormats(int number) {
        System.out.printf("Decade: %d%n", number);
        System.out.printf("Binary: %s%n", Integer.toBinaryString(number)); // Integer.toString(number, 2);
        System.out.printf("Octal: %s%n", Integer.toOctalString(number));
        System.out.printf("Hexadecimal: %s%n", Integer.toHexString(number));
    }

}
