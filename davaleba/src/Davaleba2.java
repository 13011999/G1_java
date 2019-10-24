import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Davaleba2 {

    public static void main(String... args) throws IOException {

        BufferedReader dataReader = new BufferedReader(new FileReader("results.txt"));
        String line;
        List<Float> numbers = new ArrayList<>();

        while ((line = dataReader.readLine()) != null){
            numbers.add(Float.parseFloat(line));
        }
        dataReader.close();

        System.out.println("Minimaluri ricxvi: " + Collections.min(numbers));
        System.out.println("Maximaluri ricxvi:  " + Collections.max(numbers));

}

}
