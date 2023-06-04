//Write a Java program to read the contents of a text file and display them on the console.


package topics._16_file_io.PracticeQuestion;

import java.io.FileReader;
import java.io.IOException;

public class q1 {
}
class TextFile{
    public void readContents(){
        try {
            FileReader fileRObj = new FileReader("D:/JAVA/BridgeLabzClass/FileIOPractice/example3.odt");
            int character;
            while ((character = fileRObj.read()) != -1){
                System.out.print((char) character);
            }
        }catch (IOException e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        TextFile textFile = new TextFile();
        textFile.readContents();
    }
}
