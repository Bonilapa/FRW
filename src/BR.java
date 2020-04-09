import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BR
{
    public ArrayList<String> read (File in) {

        BufferedReader br = null;

        try {

            br = new BufferedReader(new FileReader(in));

        } catch (FileNotFoundException e) {

            e.printStackTrace();
        }

        ArrayList<String> arrayList = new ArrayList<>();
        String text = null;

        do{
            try {

                text = br.readLine();
                arrayList.add(text);

            } catch (IOException e) {

                e.printStackTrace();
            }
        }while(text != null);

        arrayList.remove(arrayList.size()-1);

        return arrayList;
    }
}