import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DIS {
    public List<String> read(File fileIn){

        List<String> list = new ArrayList<>();
        DataInputStream dataIn = null;

        try {

            dataIn = new DataInputStream(new FileInputStream(fileIn));

        } catch (FileNotFoundException e) {

            e.printStackTrace();
        }

        String s = null;

        while(true){
            try {

                if (!(dataIn.available() > 0)) break;

            } catch (IOException e) {

                e.printStackTrace();
            }

            try {
                s = dataIn.readUTF();

            } catch (IOException e) {

                e.printStackTrace();
            }
            System.out.println(s);
        }


        return list;
    }
}
