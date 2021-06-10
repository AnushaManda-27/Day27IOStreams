import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadWriteAddressBook {

    public static void main(String[] args) throws IOException {

        

        File file = new File("C:\\Users\\M Veeraiah\\Desktop\\javamain\\TextFile.txt");
        Scanner scanner = new Scanner(file);
        
        while(scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        
        String fileContent = "";
        while(scanner.hasNextLine()) {
            
            fileContent = fileContent.concat(scanner.nextLine() + "\n");
        }


        FileWriter writer = new FileWriter("C:\\Users\\M Veeraiah\\Desktop\\javamain\\TextFile.txt");
        writer.write(fileContent);
        writer.close();
    }
}
