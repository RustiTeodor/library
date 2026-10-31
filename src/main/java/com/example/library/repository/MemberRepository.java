package com.example.library.repository;

import com.example.library.model.Member;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class MemberRepository {
    private List<Member> members = new ArrayList<>();

    // Salvează un membru
    public Member save(Member member) {
        members.add(member);
        return member;
    }

    // Găsește toți membrii
    public List<Member> findAll() {
        return members;
    }

    // Găsește un membru după ID
    public Optional<Member> findById(String id) {
        return members.stream()
                .filter(m -> m.getId().equals(id))
                .findFirst();
    }

    // Șterge un membru după ID
    public void delete(String id) {
        members.removeIf(m -> m.getId().equals(id));
    }
}
