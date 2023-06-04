/*
 */

package topics._16_file_io.file.example.example1;

import java.io.File;
import java.io.IOException;

public class FileExplain {
    public void fileCreation(){
        try {
            File file = new File("D:/JAVA/BridgeLabzClass/FileIOPractice/example2.odt"); // create file object and give file path
            file.createNewFile();   // Creation for new file
            System.out.println(file.createNewFile()); //show file created or not boolean value
//            System.out.println(file.exists());//Check file exist or not
        }
        catch (IOException e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        FileExplain fileExplainObj = new FileExplain();
        fileExplainObj.fileCreation();
    }
}
