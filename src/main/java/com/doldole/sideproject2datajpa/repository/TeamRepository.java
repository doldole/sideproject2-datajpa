package com.doldole.sideproject2datajpa.repository;

import com.doldole.sideproject2datajpa.entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team, Long> {
}
