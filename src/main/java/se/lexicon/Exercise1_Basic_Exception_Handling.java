package se.lexicon;

public class Exercise1_Basic_Exception_Handling {

    void Divide_By_Zero(){
        int firstNumber = Integer.parseInt(IO.readln("Enter the first interger: "));
        int secondNumber = Integer.parseInt(IO.readln("Enter the first interger: "));

        try {
            int result = firstNumber / secondNumber;
            IO.println("The result is: " + result);
        } catch (ArithmeticException e){
            IO.println("❌ You cannot divide by zero: " + e.getMessage());
        }
    }
}
