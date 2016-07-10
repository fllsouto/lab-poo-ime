package class10.Exercise2;

import java.io.*;
import java.util.Random;

/**
 * Created by fsouto on 02/06/16.
 */
public class Exercise2 {
    public static Random rand;
    public static void main(String[] args) {
        int experimentSize = 100;
        rand = new Random();
        long terminalTime = printInTerminal(experimentSize);
        long filelTime = printInFile(experimentSize);
        System.out.println("Experiment size: " + experimentSize);
        System.out.println("Terminal time: " + (terminalTime/1000000.0) + " ms");
        System.out.println("File time: " + (filelTime/1000000.0) + " ms");

        if(terminalTime < filelTime)
            System.out.println("Terminal Wins\nTime difference: " + ((filelTime - terminalTime)/1000000.0) + " ms");
        else
            System.out.println("File Wins\nTime difference: " + ((terminalTime - filelTime)/1000000.0 + " ms"));
    }

    public static long printInTerminal(int max) {
        int i = 0;
        long startTime = System.nanoTime();
        long stopTime;
        for(i = 0; i < max; i++) {
            System.out.println("[" + i + "]" + " = " + getRandom());
        }
        stopTime = System.nanoTime();
        return stopTime - startTime;
    }

    public static long printInFile(int max) {
        int i = 0;
        String filenameOutput = "timer.txt";
        String filePath = "src/class10/Exercise2/";
        String fileEncoding = "UTF-8";
        PrintWriter writer;
        long startTime = System.nanoTime();
        long stopTime;
        try {
            writer = new PrintWriter(filePath + filenameOutput, fileEncoding);
            for(i = 0; i < max; i++) {
//                System.out.println(">> [" + i + "]" + " = " + getRandom());
                writer.println("[" + i + "]" + " = " + getRandom());
//                Thread.sleep(100);
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        }
        stopTime = System.nanoTime();
        return stopTime - startTime;
    }

    public static int getRandom() {
        return rand.nextInt();
    }
}
