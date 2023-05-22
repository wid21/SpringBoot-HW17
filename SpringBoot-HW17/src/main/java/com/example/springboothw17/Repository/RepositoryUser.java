package com.example.springboothw17.Repository;

import com.example.springboothw17.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryUser extends JpaRepository<User,Integer> {
}
