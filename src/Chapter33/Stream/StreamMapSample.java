package Chapter33.Stream;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapSample {
    public static void main(String[] args) {
        StreamMapSample sample = new StreamMapSample();
        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        sample.multiplyWithFor(intList);

        List<StudentDTO> studentList = new ArrayList<>();
        studentList.add(new StudentDTO("뭉치", 19, 100, 100));
        studentList.add(new StudentDTO("지우", 29, 50, 50));
        studentList.add(new StudentDTO("쿠키몬스터", 200, 99, 99));
        sample.printName(studentList);
    }

    public void multiplyWithFor(List<Integer> intList) {
        intList.stream().map(x -> x*3).forEach(System.out::println);
    }

    public void printName(List<StudentDTO> studentList) {
        studentList.stream().map(x -> x.getName()).collect(Collectors.toList());
    }
}
