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
            sc = new Scanner(fileIn, StandardCharsets.UTF_8.toString());

        } catch (FileNotFoundException e) {

            e.printStackTrace();
        }

        String text = null;
        System.out.println(sc.hasNextLine());
        while(sc.hasNextLine()){
            text = sc.nextLine();
            System.out.println(4444);
            arrayList.add(text);
        }


        return arrayList;
    }
}
