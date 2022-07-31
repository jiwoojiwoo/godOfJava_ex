package Chapter33.Stream;

import java.util.ArrayList;
import java.util.List;

public class StudentForEachSample {
    public static void main(String[] args) {
        StudentForEachSample sample = new StudentForEachSample();
        List<StudentDTO> studentList = new ArrayList<>();
        studentList.add(new StudentDTO("뭉치", 19, 100, 100));
        studentList.add(new StudentDTO("지우", 29, 50, 50));
        studentList.add(new StudentDTO("쿠키몬스터", 200, 99, 99));
        sample.printStudentNames(studentList);
    }

    public void printStudentNames(List<StudentDTO> students) {
        students.stream().forEach(student -> System.out.println(student.getName()));
        students.stream().map(student -> student.getName()).forEach(name-> System.out.println(name));

    }
}
