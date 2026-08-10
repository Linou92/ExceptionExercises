package se.lexicon;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() throws OutOfRangeException {

        /*IO.println("--- Exercise 1: Basic Exception Handling ---");
        Exercise1_Basic_Exception_Handling exercise1 = new Exercise1_Basic_Exception_Handling();
        exercise1.Divide_By_Zero();*/

        IO.println("--- Exercise 2: Multiple Exception Types ---");
        Exercise2_Multiple_Exception_Types exercise2 = new Exercise2_Multiple_Exception_Types();
        exercise2.checkRange();
    }
}
