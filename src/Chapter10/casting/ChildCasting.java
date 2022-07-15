package Chapter10.casting;

public class ChildCasting extends ParentCasting{
    public ChildCasting() {
    }
    public ChildCasting(String name) {
    }
    public void printName() {
        System.out.println("printName() - Child");
    }
    public void printAge() {
        System.out.println("printAge()");
    }
}
