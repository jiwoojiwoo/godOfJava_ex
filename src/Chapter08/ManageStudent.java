package Chapter08;

public class ManageStudent {
    public static void main(String[] args) {
        ManageStudent manageStudent = new ManageStudent();
        Student[] student = null;
        student = manageStudent.addStudent();
        manageStudent.printStudents(student);
    }

    public Student[] addStudent(){
        Student[] student = new Student[3];
        student[0] = new Student("Lim");
        student[1] = new Student("Min");
        student[2] = new Student("Sook", "Seoul", "01012341234", "ex@gmail.com");
        return  student;
    }

    public void printStudents(Student[] student) {
        for(Student s : student){
            System.out.println(s);
        }
    }
}
