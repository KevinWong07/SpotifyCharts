import java.io.*;
import java.util.*;

public class SpotifyCharts{

    public static void main(String[] args) {
        String fileName = "regional-global-weekly-2020-08-21--2020-08-28.csv";
        String line;
        Scanner sc = new Scanner(fileName);
        
        // create List to insert elements
        List<String[]> chart = new ArrayList<String[]>();
        while((line = sc.nextLine()) != null) {
            chart.add(line.split(",")); // .split() tells scanner to switch cell at comma
        }
        sc.close();

        // convert List to String array 
        String[][] array = new String[chart.size()][0];
        chart.toArray(array);
        
        // Check and prints duplicates in 2D array 
        int count = 0;
        for (int row = 0; row < array.length; row++) {
            String str = array[row][2];

            for (int j = 0; j < array.length; j++) {
                if (str.equals(array[j][2])) {
                    count++;
                }
            }
            System.out.println(str + " has been listed: " + count + " times.");
        }
    }
}