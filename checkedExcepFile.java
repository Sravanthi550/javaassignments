package com.training.basics;
import java.io.*;
import java.util.*;
public class checkedExcepFile {

        public static void main(String[] args)
                throws FileNotFoundException
        {
            FileInputStream abc = null;
            try {
                abc = new FileInputStream(
                        "/home/sravanthi/abc.txt");
            }
            catch (FileNotFoundException e) {
                System.out.println("File does not exist");
            }
        }

}
