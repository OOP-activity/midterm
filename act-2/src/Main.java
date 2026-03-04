package src;
import java.io.File;
import java.util.Scanner;
import java.io.PrintWriter;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws Exception{

        File file = new File("file-output/test.txt");

        System.out.println("Does it exist? " + file.exists());
        System.out.println("Can it be read? " + file.canRead());
        System.out.println("Can it be written? " + file.canWrite());
        System.out.println("Is it a directory? " + file.isDirectory());
        System.out.println("Is it a file? " + file.isFile() );
        System.out.println("Is it absolute? " + file.isAbsolute());
        System.out.println("Is it hidden? " + file.isHidden());
        System.out.println("What is its absolute path? " + file.getAbsolutePath());
        System.out.println("What is its name? " + file.getParent());
        System.out.println("When was it last modified? " + new Date(file.lastModified()));
        System.out.println("What is its length? " + file.length());
    }
}
