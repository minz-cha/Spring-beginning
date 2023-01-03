package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.*;

public class MemoryMemberRepository implements MemberRepository {

    private static Map<Long, Member> store = new HashMap<>(); // 저장 형태
    private static long sequence = 0L; //키 값 생성 변수

    @Override
    public Member save(Member member) {
        member.setId(++sequence);
        store.put(member.getId(), member);
        return member;
    }

    @Override
    public Optional<Member> findById(Long id) {
        return Optional.ofNullable(store.get(id));
        //null이 나올 가능성이 있기 때문에 ofNullable로 감싸서 반환
    }

    @Override
    public Optional<Member> findByName(String name) {
        return store.values().stream()
                .filter(member -> member.getName().equals(name))
                .findAny(); //getName이 해당 parameter로 넘어온 name과 같은지 확인
        //없으면 Optional에 null 포함되어 반환
    }

    @Override
    public List<Member> findAll() {
        return new ArrayList<>(store.values());
        //map 형태의 store에 저장된 값들 반환
    }
}
