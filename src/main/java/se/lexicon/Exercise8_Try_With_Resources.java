package se.lexicon;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Exercise8_Try_With_Resources {

    void writeFile(){
        Path path = Path.of("output.txt");
        String text = "This text was written into a file !";

        try(BufferedWriter writer = Files.newBufferedWriter(path)){
            writer.write(text);
            IO.println("✅ Text successfully written inside the file.");
        } catch(IOException e){
            IO.println("❌ Error writing to file: " + e.getMessage());
        }
    }
}
