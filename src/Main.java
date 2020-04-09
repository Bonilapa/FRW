// studied with
// https://www.geeksforgeeks.org/different-ways-reading-text-file-java/

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        File fileIn = new File("in22.txt");
        List<String> arrayList = null;

        arrayList = dis(fileIn);

        for(Iterator iterator = arrayList.iterator(); iterator.hasNext();) {
            System.out.println(iterator.next());
        }

    }

    // BufferedReader
    public static List<String> br(File fileIn){

        BR br = new BR();
        return br.read(fileIn);
    }

    // FileReader
    public static List<String> fr(File fileIn){

        FR fr = new FR();
        return fr.read(fileIn);
    }

    // Scanner
    // hasNextLine = false on windows 10 default charset.
    // Unapplicable file reading
    public static List<String> sc(File fileIn){

        SC sc = new SC();
        return sc.read(fileIn);
    }

    // Scanner without loops as a single line
    // sc.next = no such element.
    // Unapplicable file reading
    public static List<String> scwl(File fileIn){

        SCWL sc = new SCWL();
        return sc.read(fileIn);
    }

    // All file line into List<>
    public static List<String> ral(File fileIn){

        List<String> list = Collections.emptyList();// create immutable list

        try {
            list = Files.readAllLines(Paths.get(fileIn.getName()), StandardCharsets.UTF_16);

        } catch (IOException e) {

            e.printStackTrace();
        }

        return list;
    }

    // Read bytes into a single string
    public static List<String> ss(File fileIn){
        SS ss = new SS();
        return ss.read(fileIn);
    }

    // DataInputStream
    public static List<String> dis(File fileIn){
        DIS dis = new DIS();
        return dis.read(fileIn);
    }
}