package se.lexicon;

public class Exercise5_Finally_Block {

    void Divide_By_Zero(){
        int firstNumber = Integer.parseInt(IO.readln("Enter the first interger: "));
        int secondNumber = Integer.parseInt(IO.readln("Enter the second interger: "));

        try {
            int result = firstNumber / secondNumber;
            IO.println("The result is: " + result);
        } catch (ArithmeticException e){
            IO.println("❌ You cannot divide by zero: " + e.getMessage());
        } finally {
            IO.println("✅ The calculation is finished.");
        }
    }
}
