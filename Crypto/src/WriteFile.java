import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

    public void create(){
        try {
            File myObj = new File("/Users/tom/Dev/simple-crypt-TomCorson/alteredSonnet18.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public void write(String input){
        try {
            FileWriter myWriter = new FileWriter("/Users/tom/Dev/simple-crypt-TomCorson/alteredSonnet18.txt");
            myWriter.write(input);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }


    }

