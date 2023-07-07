package com.mysite.sbb.user;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserReposiroty extends JpaRepository<SiteUser, Long> {
}
