package org.fileIO;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class fileio {
    public static void main(String[] args) {
        String filePath = "D:\\Second\\src\\main\\java\\org\\fileIO\\data.txt";

        try (FileWriter fw = new FileWriter(filePath)) {
            String message = "Hello My name is Dhruv and I am from Junagadh and currently pursuing the masters from DAIICT.";
            fw.write(message);
            fw.flush(); // Ensure the data is written before closing
        } catch (IOException e) {
            System.out.println("Error while writing to the file: " + e);
        }


        try (FileReader fr = new FileReader(filePath)) {
            int ch;
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }
        } catch (IOException e) {
            System.out.println("Error while reading the file: " + e);
        }
    }
}
