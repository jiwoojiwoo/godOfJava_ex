package Chapter10.casting;

public class InheritanceCasting {
    public static void main(String[] args) {
        InheritanceCasting inheritance = new InheritanceCasting();
        inheritance.objectCast();
        inheritance.objectCastArray();
    }

    public void objectCast() {
        ChildCasting child = new ChildCasting();
        ParentCasting parent = child;
        ChildCasting child2 = (ChildCasting) parent;
    }

    public void objectCastArray() {
        ParentCasting[] parentArray = new ParentCasting[3];
        parentArray[0] = new ChildCasting();
        parentArray[1] = new ParentCasting();
        parentArray[2] = new ChildCasting();
        objectTypeCheck(parentArray);
    }

    private  void objectTypeCheck(ParentCasting[] parrentArray) {
        for(ParentCasting tempParent : parrentArray) {
            if(tempParent instanceof ChildCasting){
                System.out.println("ChildCasting");
                ChildCasting tempChild = (ChildCasting) tempParent;
                tempChild.printAge();
            }else{
                System.out.println("ParentCasting");
            }
        }
    }
}
