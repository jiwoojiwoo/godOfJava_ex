package Chapter08;

import java.sql.Ref;

public class ReferenceConstructor {
    public static void main(String[] args) {
        ReferenceConstructor reference = new ReferenceConstructor();
        reference.makeMemberObject();
    }

    public void makeMemberObject(){
        MemberDTO dto1 = new MemberDTO();
        MemberDTO dto2 = new MemberDTO("Jiwoo");
        MemberDTO dto3 = new MemberDTO("Jiwoo", "01012341234");
        MemberDTO dto4 = new MemberDTO("Jiwoo", "01012341234", "ex@gmail.com");
    }
}
