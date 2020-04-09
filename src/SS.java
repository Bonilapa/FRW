import sun.plugin.javascript.navig.Link;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class SS {
    public List<String> read(File fileIn){
        List<String> list = new ArrayList<>();

        try {
            list.add(new String(Files.readAllBytes(Paths.get(fileIn.getName()))));

        } catch (IOException e) {

            e.printStackTrace();
        }


        return list;

    }
}
