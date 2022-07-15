package Chapter08;

public class ReferenceStatic {
//    String name = "Jiwoo";
    static String name = "Jiwoo";
    public static void main(String[] args) {
        ReferenceStatic.staticMethod();
        ReferenceStatic.staticMethodCallVariable();
    }

    public static void staticMethod(){
        System.out.println("This is a staticMethod.");
    }

    public static void staticMethodCallVariable() {
        System.out.println(name);

    }
}
