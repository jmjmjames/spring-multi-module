package com.jongmin.modulecommon.repository;

import com.jongmin.modulecommon.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
