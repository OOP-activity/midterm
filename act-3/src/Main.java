package src;
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        File stuff1Ref = new File("files/stuff1.txt");
        File stuff2Ref = new File("files/stuff2.txt");

        if (!stuff1Ref.exists() || !stuff2Ref.exists()) {
            System.out.println("stuff.txt file must exist!");
            System.exit(0);
        }

        PrintWriter stuff2Writter = new PrintWriter(stuff2Ref);
        Scanner stuff1 = new Scanner(stuff1Ref);


        while (stuff1.hasNext()){
            String line = stuff1.nextLine();
            stuff2Writter.println( line );
        }

        stuff2Writter.close();

    }

}
