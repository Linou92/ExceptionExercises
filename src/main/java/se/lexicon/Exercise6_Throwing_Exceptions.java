package se.lexicon;

public class Exercise6_Throwing_Exceptions {

    void validEmail (String email) throws IllegalArgumentException {
        if(email == null || !email.contains("@") || !email.contains(".")) {
            throw new IllegalArgumentException("❌ Invalid email address.");
        }
        IO.println("✅ Valid email address.");
    }
}
