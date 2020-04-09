import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        File fileIn = new File(args[0]);
        ArrayList<String> arrayList = null;

        arrayList = br(fileIn);

        for(Iterator iterator = arrayList.iterator(); iterator.hasNext();) {
            System.out.println(iterator.next());
        }

    }

    //BufferedReader
    public static ArrayList<String> br(File fileIn){

        BR br = new BR();
        return br.read(fileIn);
    }

    //FileReader
    public static ArrayList<String> fr(File fileIn){

        FR fr = new FR();
        return fr.read(fileIn);
    }
}