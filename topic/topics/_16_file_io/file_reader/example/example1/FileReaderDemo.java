
package topics._16_file_io.file_reader.example.example1;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
    public void readFromFile() {
        try {
            FileReader fileReader = new FileReader("D:/JAVA/BridgeLabzClass/FileIOPractice/example3.odt");
            int character;
            while ((character = fileReader.read()) != -1) {// if nothing else find than char value is -1
                System.out.print((char) character);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        FileReaderDemo fileReaderDemo = new FileReaderDemo();
        fileReaderDemo.readFromFile();
    }
}
