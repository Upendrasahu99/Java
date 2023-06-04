package topics._16_file_io.file.example.example2;

import java.io.File;
import java.io.IOException;

public class FileInformation {
    public void fileInformation(){
        try{
            File file = new File("D:/JAVA/BridgeLabzClass/FileIOPractice/example8.odt");
            System.out.println("File created : " + file.createNewFile()); // createNewFile is boolean value
            System.out.println("File exists : " + file.exists());
            System.out.println("FIle name : " + file.getName());
            System.out.println("FIle path : " + file.getAbsoluteFile());
        }
        catch (IOException e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        FileInformation fileInformationObj = new FileInformation();
        fileInformationObj.fileInformation();
    }
}
