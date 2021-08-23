package com.careerinfotech.usermanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.careerinfotech.usermanagement.entity.UserProfile;

public interface UserDao extends JpaRepository<UserProfile, Long>{



}
