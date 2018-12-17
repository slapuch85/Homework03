package pl.coderslab.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class GenerateRandom {

    public static void main(String[] args) {

        int amount = 500000, interval = 10;
        Map <Integer, Integer> map = new HashMap<>();
        map = checkRand(amount, interval);
        for(Integer i : map.keySet()){
            System.out.println(i+" : "+map.get(i));
        }

    }

    public static Map<Integer, Integer> checkRand(int amount, int interval){

        Random rand = new Random();

        Map <Integer, Integer> map = new HashMap<>();
        for (int i = 0; i <= amount; i++) {
            int liczba = rand.nextInt(10);
            if (!map.containsKey(liczba)) {
                map.put(liczba, 1);
            }
            else{
                map.put(liczba, map.get(liczba)+1);
            }
        }
        return map;
    }
}
