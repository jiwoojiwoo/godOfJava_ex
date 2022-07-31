package Chapter32;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class JoinStringOnlyComma {
    public static void main(String[] args) {
        JoinStringOnlyComma sample = new JoinStringOnlyComma();
        String[] arr = new String[]{"StudyHard", "Park!!!", "Study!!"};
//        sample.func(arr);
        sample.withCollector(arr);
    }
    public void func(String[] stringArray) {
        StringJoiner joiner = new StringJoiner(",", "(", ")");
        for (String string : stringArray) {
            joiner.add(string);
        }
        System.out.println(joiner);
    }

    public void withCollector(String[] stringArray) {
        List<String> stringList = Arrays.asList(stringArray);
        String result = stringList.stream()
                .collect(Collectors.joining(","));
        System.out.println(result);
    }
}
