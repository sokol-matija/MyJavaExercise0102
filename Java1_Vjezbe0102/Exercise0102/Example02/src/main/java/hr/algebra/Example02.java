/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package hr.algebra;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author daniel.bele
 */
public class Example02 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)){
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();
            
            System.out.printf("Your name: %s%n", name);
            
        } catch (Exception e) {
            e.printStackTrace();
        } 
        
        try (Miroslav miroslav = new Miroslav()){
            //System.exit(0); // 1 throws Exception that is not catched!
            return; // this is trully finally
        } catch (Exception ex) {
            Logger.getLogger(Example02.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
    private static class Miroslav implements AutoCloseable{

        @Override
        public void close() throws Exception {
            System.out.println("Skoro");
        }
        
    }
}
