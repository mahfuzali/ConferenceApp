package com.mahfuz.conferencedemo.repositories;

import com.mahfuz.conferencedemo.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {
}
