package se.lexicon;

import javax.naming.InvalidNameException;
import java.util.ArrayList;
import java.util.List;

public class Exercise7_Custom_Exceptions_For_List_Operations {

    private List<String> names = new ArrayList<>();

    public void addName(String name) throws DuplicateNameException{
        if(names.contains(name)){
            throw new DuplicateNameException("❌ The name already exists: " + name);
        }
        names.add(name);
        IO.println("✅ Name added: " + name);
    }

    public void findName(String name) throws NameNotFoundException {
        if(!names.contains(name)){
            throw new NameNotFoundException("❌ Name not found: " + name);
        }
        IO.println("✅ Name found: " + name);
    }
}
