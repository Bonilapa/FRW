import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class SCWL {
    public ArrayList<String> read(File fileIn){

        ArrayList<String> arrayList = new ArrayList<>();
        Scanner sc = null;
        try {

            sc = new Scanner(fileIn);

        } catch (FileNotFoundException e) {

            e.printStackTrace();
        }

        sc.useDelimiter("\\Z");
        System.out.println(sc.next());
        arrayList.add(sc.next());

        return arrayList;
    }
}
