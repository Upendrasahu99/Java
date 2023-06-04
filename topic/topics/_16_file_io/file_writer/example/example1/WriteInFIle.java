package topics._16_file_io.file_writer.example.example1;

import java.io.FileWriter;
import java.io.IOException;

public class WriteInFIle {
public void fileWrite(){
    try{
        FileWriter fileWriter = new FileWriter("D:/JAVA/BridgeLabzClass/FileIOPractice/example.odt");
        fileWriter.write("ram");
        fileWriter.flush();
        fileWriter.close();
    }
    catch (IOException e) {
        System.out.println(e);
    }
}

    public static void main(String[] args) {
        WriteInFIle writeInFIle = new WriteInFIle();
        writeInFIle.fileWrite();
    }
}
