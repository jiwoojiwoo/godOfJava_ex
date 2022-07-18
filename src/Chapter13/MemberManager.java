package Chapter13;

import Chapter08.MemberDTO;

public interface MemberManager {
    public boolean addMember(MemberDTO member);
    public boolean removeMember(MemberDTO member);
    public boolean updateMember(MemberDTO member);
}
