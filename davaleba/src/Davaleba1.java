import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Davaleba1 {

    public static void main(String... args) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("results.txt", true));
        for (float x = 1, x2=2; x <= x2; x += 0.01) {
            writer.write(String.valueOf((float) Math.pow(x, 2) + 2 * x + 3));
            writer.newLine();
        }
        writer.close();
    }

}
