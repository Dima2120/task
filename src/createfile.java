import java.io.*;
import java.lang.*;
import java.util.*;

public class createfile {


    private Formatter x;

    public void openFile() {
        try {
            x = new Formatter("C:\\task\\text.txt");
        } catch (Exception e) {
            System.out.println("you have an error");
        }
    }

    public void addRecords() {
        x.format("1.first record; 2.second record; 3.third record; 4.fourth record; 5.fives record");
    }

    public void closeFile() {
        x.close();
    }
}


