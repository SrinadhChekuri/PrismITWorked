package com.prismit.Multithreading.srinadh;
import java.io.FileWriter;
import java.io.IOException;

public class WritingToTextFile {

    public static void main(String[] args) throws Exception{
        //try {
            FileWriter writer = new FileWriter("C:\\Users\\cheku\\Desktop\\file\\text.txt", true);
            writer.write("Hello World");
            writer.write("\r\n");   // write new line
            writer.write("Good Bye!");
            writer.write("\r\n"); 
            writer.write("well done");
            writer.write("\r\n"); 
            writer.write("boys");
            writer.close();
       // } catch (IOException e) {
      //      e.printStackTrace();
      //  }
 
    }
 
}
