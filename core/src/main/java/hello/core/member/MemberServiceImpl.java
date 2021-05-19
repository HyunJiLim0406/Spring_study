package hello.core.member;

public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository; //인터페이스만 알고 있음

    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}