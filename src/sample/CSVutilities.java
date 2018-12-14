package sample;

import java.awt.print.Book;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class CSVutilities {
    ArrayList<String> CSVData;
    int numColumns;

    public CSVutilities(File csv) throws FileNotFoundException,java.io.IOException {
        this.CSVData=CSVData;
        this.numColumns=numColumns;



        try(BufferedReader br= Files.newBufferedReader(csv.toPath(), StandardCharsets.UTF_8))
        {

            String line=br.readLine();
            while(line!=null)
            {
                String [] attributes=line.split(",");
                Book =(attributes);
            }
        }
    }
}
