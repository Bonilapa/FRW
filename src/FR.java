import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FR {
    public ArrayList<String> read(File in){
        FileReader fileReader = null;
        try {

            fileReader = new FileReader(in);

        } catch (FileNotFoundException e) {

            e.printStackTrace();
        }

        Integer i = null;
        StringBuilder sb = new StringBuilder();
        ArrayList<String> arrayList = new ArrayList<>();
        do{
            try {

                i = fileReader.read();
                sb.append((char)i.intValue());

            } catch (IOException e) {

                e.printStackTrace();
            }
        }while(i != -1);

        arrayList.add(sb.toString());

        return arrayList;
    }
}
