package Chapter13;

import Chapter08.MemberDTO;

public abstract class MemberManagerAbstract {
    public abstract boolean addMember(MemberDTO member);
    public abstract boolean removeMamber(MemberDTO member);
    public abstract boolean updateMember(MemberDTO member);

    public void printLog(String data) {
        System.out.println("Data = "+data);
    }
}
