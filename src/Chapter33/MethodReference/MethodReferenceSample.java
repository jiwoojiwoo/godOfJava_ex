package Chapter33.MethodReference;

import java.util.Arrays;
import java.util.stream.Stream;

public class MethodReferenceSample {
    public static void main(String[] args) {
        MethodReferenceSample sample = new MethodReferenceSample();
        String[] stringArray = {"뭉치", "지우", "쿠몬"};
        sample.staticReference(stringArray);
        sample.objectReference(stringArray);
        sample.createInstance();
    }

    private static void printResult(String value) {
        System.out.println(value);
    }

    private void staticReference(String[] stringArray) {
        Stream.of(stringArray).forEach(MethodReferenceSample::printResult);
    }

    private void objectReference(String[] stringArray) {
        Arrays.sort(stringArray, String::compareToIgnoreCase);
        Arrays.asList(stringArray).stream().forEach(System.out::println);
    }

    private void createInstance() {
        MakeString makeString = String::new;
        char[] chars = {'G', 'o', 'd', 'O', 'f', 'J', 'a', 'v', 'a'};
        String madeString = makeString.fromBytes(chars);
        System.out.println(madeString);
    }
}
