package Chapter23;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SetSample {
    public static void main(String[] args) {
        SetSample sample = new SetSample();
        String[] cars = new String[]{
                "Tico", "Sonata", "BMW", "Benz"
                ,"Tico", "Sonata", "SM5", "Sm3"
        };
        System.out.println(sample.getCarKinds(cars));
    }

    public int getCarKinds(String[] cars) {
        if(cars==null) return 0;
        if(cars.length == 1) return 1;
        Set<String> carSet = new HashSet<>();
        for (String car : cars) {
            carSet.add(car);
        }
        return carSet.size();
    }
}
