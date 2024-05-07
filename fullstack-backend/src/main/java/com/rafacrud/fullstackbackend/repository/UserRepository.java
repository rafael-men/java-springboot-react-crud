
package com.rafacrud.fullstackbackend.repository;

import com.rafacrud.fullstackbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long>{
    
}
