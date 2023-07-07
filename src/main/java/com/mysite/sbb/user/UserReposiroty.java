package com.mysite.sbb.user;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UserReposiroty extends JpaRepository<SiteUser, Long> {
    Optional<SiteUser> findByusername(String username);
}
