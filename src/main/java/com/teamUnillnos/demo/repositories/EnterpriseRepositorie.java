package com.teamUnillnos.demo.repositories;

import com.teamUnillnos.demo.entities.Enterprise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnterpriseRepositorie extends JpaRepository<Enterprise, Long> {
}
