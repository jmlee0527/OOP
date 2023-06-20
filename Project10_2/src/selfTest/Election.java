package selfTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Election {
    public static void main(String[] args) {
        
        Calculator calculator = new Calculator();
        
        try (Scanner scanner = new Scanner(new FileInputStream("resource/candidate.txt"))) {
            while (scanner.hasNextLine()) {
                String name = scanner.nextLine();
                calculator.addName(name);
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found or already be opened");
            System.exit(0);
        } catch (NoSuchElementException e) {
            System.err.println("Out of Boundary");
            System.exit(0);
        } catch (IOException e) {
            System.err.println("IOException");
            System.exit(0);
        }
        try (PrintWriter writer = new PrintWriter(new FileOutputStream("resource/election.txt"))) {
            String results = calculator.toStringAllList();
            writer.println(results);
        } catch (IOException e) {
            System.err.println("IOException");
            System.exit(0);
        }
    }
}

