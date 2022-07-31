package Chapter33.Stream;

import java.util.ArrayList;
import java.util.List;

public class StudentFilterSample {
    public static void main(String[] args) {
        StudentFilterSample sample = new StudentFilterSample();
        List<StudentDTO> studentList = new ArrayList<>();
        studentList.add(new StudentDTO("뭉치", 19, 100, 100));
        studentList.add(new StudentDTO("지우", 29, 50, 50));
        studentList.add(new StudentDTO("쿠키몬스터", 200, 99, 99));

        sample.filterWithScoreForLoop(studentList, 80);
    }

    public void filterWithScoreForLoop(List<StudentDTO> studentList, int scoreCutLine) {
//        for (StudentDTO student : studentList) {
//            if(student.getScoreMath() > scoreCutLine)
//                System.out.println(student.getName());
//        }

        studentList.stream()
                .filter(student -> student.getScoreMath() > scoreCutLine)
                .forEach(student -> System.out.println(student.getName()));
    }
}
