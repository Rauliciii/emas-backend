package org.europol.eu.emas.emasbackend.repository;


import org.europol.eu.emas.emasbackend.model.Role;
import org.europol.eu.emas.emasbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    //findBy + fieldName
    Optional<User> findByUsername(String username);

    @Modifying
    @Query("update User set role = :role where username= :username")
    void updateUserRole(@Param("username") String email, @Param("role") Role role);

}
