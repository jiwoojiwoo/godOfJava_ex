package Chapter12;

public class ManageStudent {
    public static void main(String[] args) {
        ManageStudent manageStudent = new ManageStudent();
        manageStudent.checkEquals();
    }

    public void checkEquals() {
        Student a = new Student("Min", "Seoul", "01012341234", "ask@godofjava.com");
        Student b = new Student("Min", "Seoul", "01012341234", "ask@godofjava.com");

        if(a.equals(b)) {
            System.out.println("Equal");
        }else {
            System.out.println("Not Equal");
        }
    }
}
