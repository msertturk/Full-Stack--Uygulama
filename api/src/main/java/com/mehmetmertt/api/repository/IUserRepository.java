package com.mehmetmertt.api.repository;

import com.mehmetmertt.api.entity.User;
import com.mehmetmertt.api.entity.enums.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IUserRepository extends JpaRepository<User,Integer> {
    boolean existsByIdentityNo(String identityNo);
    List<User> findAllByRole(Role role);

    List<User> findAllByRoleAndIdIsNotIn(Role role,List<Integer> idList);

}