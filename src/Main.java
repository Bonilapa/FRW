import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        File fileIn = new File(args[0]);
        ArrayList<String> arrayList = null;

        arrayList = sc(fileIn);

        for(Iterator iterator = arrayList.iterator(); iterator.hasNext();) {
            System.out.println(iterator.next());
        }

    }

    // BufferedReader
    public static ArrayList<String> br(File fileIn){

        BR br = new BR();
        return br.read(fileIn);
    }

    // FileReader
    public static ArrayList<String> fr(File fileIn){

        FR fr = new FR();
        return fr.read(fileIn);
    }

    // Scanner
    // hasNextLine = false on windows 10 default charset.
    // Unapplicable file reading
    public static ArrayList<String> sc(File fileIn){

        SC sc = new SC();
        return sc.read(fileIn);
    }
}