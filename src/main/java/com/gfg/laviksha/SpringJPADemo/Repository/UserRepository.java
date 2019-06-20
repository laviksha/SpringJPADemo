package com.gfg.laviksha.SpringJPADemo.Repository;

import com.gfg.laviksha.SpringJPADemo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface UserRepository extends JpaRepository<User,Long> {
}
