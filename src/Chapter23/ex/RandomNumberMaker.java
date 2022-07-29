package Chapter23.ex;

import java.util.HashSet;
import java.util.Random;

public class RandomNumberMaker {
    public static void main(String[] args) {
        RandomNumberMaker sample = new RandomNumberMaker();
        HashSet<Integer> set;
        for(int i=0; i<10; i++){
            set = sample.getSixNumber();
            System.out.println(set);
        }
    }

    public HashSet<Integer> getSixNumber() {
        HashSet<Integer> set = new HashSet<>();
        Random random = new Random();
        while(true){
            set.add(random.nextInt(44)+1);
            if(set.size() == 6) break;
        }
        return set;
    }
}
