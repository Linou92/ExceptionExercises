package se.lexicon;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise2_Multiple_Exception_Types {

    void checkRange () throws OutOfRangeException {

        Scanner sc = new Scanner(System.in);
        try {
            IO.println("Enter a number between 1 and 100: ");
            int number = sc.nextInt();
            if (number < 1 || number > 100) {
                throw new OutOfRangeException("❌ Number must be between 1 and 100!");
            }
            IO.println(number);
        } catch (InputMismatchException e) {
            IO.println("❌ Invalid input. Enter an integer!");
        } catch (OutOfRangeException e) {
            IO.println(e.getMessage());
        }
    }
}
