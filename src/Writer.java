/*
* File: Writer.java
* Author: Csorba Péter
* Copyright: 2026, Csorba Péter
* Group: Szoft II/N
* Date: 2026-10-09
* Github: https://github.com/gunkhu
* Licenc: MIT
*/
import java.io.FileWriter;
import java.io.IOException;

public class Writer implements Writable{

    @Override
    public void writeContent(String content) {
        try (FileWriter wr = new FileWriter("outData.txt")){
            wr.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
