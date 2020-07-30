package com.example.jiaochengdemo.user.service;

import com.example.jiaochengdemo.user.dao.UserDao;
import com.example.jiaochengdemo.user.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;
import java.util.Map;
@Service
@Mapper
public class UserServiceImpl implements UserService{

    @Autowired
    UserDao userDao;
    @Override
    public List<UserEntity> getAll(Map map) {

        return userDao.getAll(map);
    }

    @Override
    public void delById(Integer id) {
        userDao.delById(id);

    }

    @Override
    @ResponseBody
    public void save(UserEntity userEntity) {

        userEntity.setCreatetime(new Date());
        userEntity.setStatus(1);
        userDao.save(userEntity );
    }
}
