package com.example.demo.repositories;

import com.example.demo.entity.AutoClave;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutoClaveRepository extends JpaRepository<AutoClave, Long> {
}
