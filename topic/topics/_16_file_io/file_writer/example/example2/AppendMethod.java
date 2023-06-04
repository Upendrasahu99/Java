package topics._16_file_io.file_writer.example.example2;

import java.io.FileWriter;
import java.io.IOException;

public class AppendMethod {
    public  void appendMethodUse(){//doubt
        try{
            FileWriter fileWriter = new FileWriter("D:/JAVA/BridgeLabzClass/FileIOPractice/example1.odt",true);
            fileWriter.append("\n");
            fileWriter.append("This text is appended to the file.");
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        AppendMethod appendMethodObj = new AppendMethod();
        appendMethodObj.appendMethodUse();
    }
}
