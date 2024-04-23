/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hr.algebra;

import hr.algebra.model.Person;
import static hr.algebra.utilities.ScannerUtils.readChar;
import static hr.algebra.utilities.ScannerUtils.readDouble;
import static hr.algebra.utilities.ScannerUtils.readInt;
import static hr.algebra.utilities.ScannerUtils.readString;
import java.util.Scanner;

/**
 *
 * @author daniel.bele
 */
public class Task01 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)){
            char again;
            do {
                handlePerson(scanner);
                again = readChar("Again (y/n): ", scanner);
            } while (again == 'y');
            
        } 
    }

    private static void handlePerson(Scanner scanner) {
        int age = readInt("Age:", scanner);
        String firstName = readString("First name:", scanner);
        String lastName = readString("Last name:", scanner);
        double salary = readDouble("Salary:", scanner);
        String gender = readString("Gender (Female/Male):", scanner, "Female", "Male");
        Person person = new Person(firstName, lastName, age, salary, gender);
        
        System.out.println(person);
    }

}
