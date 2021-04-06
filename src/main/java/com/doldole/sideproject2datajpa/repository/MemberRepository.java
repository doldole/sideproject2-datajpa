package com.doldole.sideproject2datajpa.repository;

import com.doldole.sideproject2datajpa.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
