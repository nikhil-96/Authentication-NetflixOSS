package com.user.authentication.dbservice;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDetailsRepository extends JpaRepository<User,String> {

}
