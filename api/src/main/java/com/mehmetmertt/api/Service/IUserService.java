package com.mehmetmertt.api.Service;

import com.mehmetmertt.api.Service.IService;
import com.mehmetmertt.api.entity.User;
import com.mehmetmertt.api.entity.enums.Role;

import java.util.List;

public interface IUserService extends IService<User> {
    List<User> getUserByRole(Role role);

    List<User> getPotentialUsers(List<Integer> ids);
}