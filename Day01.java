import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.io.IOException;
import java.util.ArrayList;

public class Day01 {
    public static void main(String args[]) {
        List<String> entries = new ArrayList<String>();
        try {
            entries = Files.readAllLines(Paths.get("day01.txt"));
        } catch(IOException e) {
            e.printStackTrace();
        }

        for (String sentry : entries) {
            int entry = Integer.parseInt(sentry);
            int remainder = 2020 - entry;
            if (entries.contains(Integer.toString(remainder))) {
                String result = Integer.toString(entry * remainder);
                System.out.println(result);
            }
        }
        System.out.println("craaaap");
    }
}
