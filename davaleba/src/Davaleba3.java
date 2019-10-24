import java.util.HashMap;
import java.util.Map;

public class Davaleba3 implements Davaleba3Interface {

    int a;
    int b;

    Davaleba3(int a, int b){
        this.a = a;
        this.b = b;
    }

    @Override
    public void printNumbersInRange() {
        for (; a < b; a++){
            System.out.println(a);
        }
    }

    @Override
    public void printAllDivisor() {
        for (int k=1; k <= a; k++){
            if (a % k == 0){
                System.out.println(k);
            }
        }
    }

    @Override
    public void printAllSimpleDivisor() {
        for(int k=1; k <= b; k++){
            if ( b % k == 0 && isSimple(k)){
                System.out.println(k);
            }
        }
    }

    @Override
    public char getMostFrequentDigit() {
        String numberAsString = String.valueOf(b);
        Map<Character, Integer> savedData = new HashMap<>();

        for (int j=0; j<numberAsString.length(); j++){
            Integer integer = savedData.computeIfAbsent(numberAsString.charAt(j), k -> 0);
            integer += 1;
            savedData.put(numberAsString.charAt(j), integer);
        }

        Map.Entry<Character, Integer> maxEntry = null;
        for (Map.Entry<Character, Integer> entry : savedData.entrySet())
        {
            if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0)
            {
                maxEntry = entry;
            }
        }
        assert maxEntry != null;
        return maxEntry.getKey();
    }

    private boolean isSimple(int k){
        for (int j=1, p=0; j <= k; j++){
            if (k % j == 0){
                p++;
            }

            if (p > 2){
                return false;
            }
        }

        return true;
    }

    public static void main(String... args){
        Davaleba3 task3 = new Davaleba3(12, 248);
        System.out.println("Ricxvebi shualedshi:");
        task3.printNumbersInRange();
        System.out.println("A-s yvela gamyofi");
        task3.printAllDivisor();
        System.out.println("B-s yvela martivi gamyofi");
        task3.printAllSimpleDivisor();
        System.out.println("Yvelaze xshiri cifri B-shi");
        System.out.println(task3.getMostFrequentDigit());
    }
}
