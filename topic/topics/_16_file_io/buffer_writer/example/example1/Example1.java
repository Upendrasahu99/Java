package topics._16_file_io.buffer_writer.example.example1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Example1 {
    public void writeBuffer() {
        try {
            Writer writer = new FileWriter("D:/JAVA/BridgeLabzClass/FileIOPractice/example3.odt", true);
            BufferedWriter bWr = new BufferedWriter(writer);
            bWr.write("Name");
            bWr.newLine();
            bWr.write("name");
            bWr.flush();
            bWr.close();
        } catch (IOException e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        Example1 example1 = new Example1();
        example1.writeBuffer();
    }
}
