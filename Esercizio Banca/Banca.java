import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors


public class Banca {
    ContoCorrente[] conti = new ContoCorrente[6]; {
        conti[1] = new ContoCorrente("Mario Rossi", "IT123456789012345678901234", 1000);
        conti[2] = new ContoCorrente("Luigi Bianchi", "IT123456789012345678901235", 2000);
        conti[3] = new ContoCorrente("Giovanni Verdi", "IT123456789012345678901236", 3000);
        conti[4] = new ContoCorrente("Giuseppe Neri", "IT123456789012345678901237", 4000);
        conti[5] = new ContoCorrente("Antonio Gialli", "IT123456789012345678901238", 5000);
    }

    public void saveSVG(){
        try {
            FileWriter myWriter = new FileWriter("conti.csv");
            myWriter.write("");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
          } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
    }

    
}
