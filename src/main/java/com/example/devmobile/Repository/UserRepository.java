package com.example.devmobile.Repository;

import com.example.devmobile.Entity.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserDetails,Integer> {
}
