import java.io.File;
import java.io.FileNotFoundException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

public class SC {
    public ArrayList<String> read(File fileIn){

        ArrayList<String> arrayList = new ArrayList<>();
        Scanner sc = null;
        try {
            sc = new Scanner(fileIn);

        } catch (FileNotFoundException e) {

            e.printStackTrace();
        }

        String text = null;
        System.out.println(sc.hasNextLine());
        while(sc.hasNextLine()){
            text = sc.nextLine();
            arrayList.add(text);
        }


        return arrayList;
    }
}
