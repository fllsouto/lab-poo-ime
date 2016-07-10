package class10.Exercise1;

import java.io.*;

/**
 * Created by fsouto on 02/06/16.
 */
public class Exercise1 {

    public static void main(String[] args) {
        String filenameOutput = "hello.txt";
        String filenameInput = "names.txt";
        String filePath = "src/class10/Exercise1/";
        String fileEncoding = "UTF-8";
        String defaultString = "Hello World!";
        PrintWriter writer;
        BufferedReader br;
        String line = null;

        System.out.println("Reading names from file: " + filePath + filenameInput);
        try {
            writer = new PrintWriter(filePath + filenameOutput, fileEncoding);
            br = new BufferedReader(new FileReader(filePath + filenameInput));
            while((line = br.readLine()) != null) {
                writer.println(defaultString + " " + line);
                System.out.println(defaultString + " " + line);
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Greetings written in file: " + filePath + filenameOutput);
    }
}
