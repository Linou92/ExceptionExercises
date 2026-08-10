package se.lexicon;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.util.List;

public class Exercise4_Nested_Try_Catch_Blocks {

    void readFile(){
        Path path = Path.of("numbers.txt");
        try {
            List<String> lines = Files.readAllLines(path);
            try{
                for(String line : lines){
                    int number = Integer.parseInt(line);
                    IO.println("Found number: " + number);
                }
            } catch (NumberFormatException e) {
                IO.println("❌ Invalid number in file: " + e.getMessage());
            }
        } catch (NoSuchFileException e){
            IO.println("❌ File was not found: " + path);
        } catch (IOException e){
            IO.println("❌ Error reading the file: " + e.getMessage());
        }
    }
}
