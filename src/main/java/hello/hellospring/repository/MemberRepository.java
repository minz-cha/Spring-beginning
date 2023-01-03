package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member); //회원 저장
    Optional<Member> findById(Long id); // id로 회원 찾기
    Optional<Member> findByName(String name); //이름(name)으로 회원 찾기
    List<Member> findAll(); //모든 리스트 반환
}
