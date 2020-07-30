package com.example.jiaochengdemo.user.service;


import com.example.jiaochengdemo.user.entity.UserEntity;



import java.util.List;
import java.util.Map;


public interface UserService {
    List<UserEntity> getAll(Map map);

    void delById(Integer id);

    public  void save(UserEntity userEntity);
}
