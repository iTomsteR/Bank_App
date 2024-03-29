package utilities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class CSV {

    //read data from CSV file and return as list.
    public static List<String[]> read(String fileName) {
        List<String[]> data = new LinkedList<>();

        String dataRow;
        try {

            BufferedReader br = new BufferedReader(new FileReader(fileName));

            while((dataRow = br.readLine()) != null) {
                String[] dataRecords = dataRow.split(",");
                data.add(dataRecords);
            }

        } catch (IOException e) {
            System.out.println("Could not read file.");
            e.printStackTrace();
        }

        return data;
    }
}
