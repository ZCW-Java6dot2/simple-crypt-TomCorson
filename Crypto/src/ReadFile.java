import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    private String encryptedData;


    public String alterFile() {
        StringBuilder sb = new StringBuilder();
        try {
            File myObj = new File("/Users/tom/Dev/simple-crypt-TomCorson/sonnet18.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                sb.append(ROT13.cryptStatic(data)+"\n");
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return sb.toString();
    }


}
