package main;

import java.util.*;

public class tasks {
    public static void main(String... args){

	// Pirveli davaleba
        List<Integer> koleqcia_1 = new ArrayList<>();
	List<Integer> koleqcia_2 = null;
	List<Integer> koleqcia_3 = new ArrayList<>();

        for (int j=0; j<12; j++) {
            koleqcia_1.add(new Random().nextInt());
        }
	// Davakopirot pirveli koleqciis obiekti
        koleqcia_2 = List.copyOf(koleqcia_1);

	for(int j=0; j<12; j++)
	{
		if (j % 2 != 0) koleqcia_3.add(koleqcia_1.get(j));
	}
        System.out.println(Arrays.toString(koleqcia_2.toArray()));
        System.out.println(Arrays.toString(koleqcia_3.toArray()));



	// Meore davaleba
	List<Integer> koleqcia_4 = new ArrayList<>();
        List<Integer> koleqcia_5 = new ArrayList<>();

        for(int j=0; j<12; j++){
            int randomInt = new Random().nextInt(10-5+1) + 5;
            koleqcia_4.add(randomInt);
            koleqcia_5.add(randomInt);
        }

        for(int j=0; j<12; j++){
            if(j % 3 == 0 && j != 0){
                koleqcia_5.add(j+1, new Random().nextInt(25-20+1) + 20);
            }
        }

        System.out.println(Arrays.toString(koleqcia_4.toArray()));
        System.out.println(Arrays.toString(koleqcia_5.toArray()));
    }
}