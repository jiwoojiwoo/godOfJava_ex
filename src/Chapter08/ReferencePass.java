package Chapter08;

public class ReferencePass {
    public static void main(String[] args) {
        ReferencePass reference = new ReferencePass();
        reference.callPassByReference();
    }

    public void callPassByReference() {
        MemberDTO member = new MemberDTO("Jiwoo");
        System.out.println("before passByReference");
        System.out.println("member.name = "+member.name);
        passByReference(member);
        System.out.println("after passByReference");
        System.out.println("memeber.name = "+member.name);
    }

    public void passByReference(MemberDTO member) {
        member.name = "cookie monster";
        System.out.println("in passByReference");
        System.out.println("memeber.name = "+member.name);
    }
}
