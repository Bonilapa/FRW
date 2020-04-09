import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File fileIn = new File(args[0]);
        BR br = new BR();
        ArrayList<String> arrayList = null;
        arrayList = br.read(fileIn);
        for(Iterator iterator = arrayList.iterator(); iterator.hasNext();) {
            System.out.println(iterator.next());
        }

    }
}