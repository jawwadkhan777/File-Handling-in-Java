package com.javaFile;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class FileHandling {
    public static void main(String[] args) {
        System.out.println("File handling in Java");

        File file = new File("note.txt");//create instance of file
        //creating the file
        try {
            file.createNewFile();
            System.out.println(file.exists());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        //writing in the file
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))) {
            bw.write("This is the content of "+file+"file.\nFile of Muhammad Jawwad Khan.");
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }

        //reading the file
        try(BufferedReader br = new BufferedReader(new FileReader(file))) {
            while (br.ready()) {
                System.out.println(br.readLine());
            }
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }

        //deleting file
//        if(file.delete()) {
//            System.out.println(file.getName()+" has deleted");
//        }

    }
}
