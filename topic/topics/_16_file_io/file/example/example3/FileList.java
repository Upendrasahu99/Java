package topics._16_file_io.file.example.example3;

import java.io.File;

public class FileList {
    public void listOfFile(){
        try {
            File file = new File("D:/JAVA/BridgeLabzClass/FileIOPractice");
            for(String fList : file.list()){  //list of file in String Array format
                System.out.println(fList);
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        FileList fileListObj = new FileList();
        fileListObj.listOfFile();
    }
}
