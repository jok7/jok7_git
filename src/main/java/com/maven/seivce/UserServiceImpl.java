package com.maven.seivce;

import com.maven.mapper.UserMapper;
import com.maven.pojo.User;
import com.maven.pojo.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements  UserService{

    @Autowired
    private UserMapper userMapper;
    //添加
    @Override
    public void add(User user) {
        userMapper.insert(user);
    }

    //删除
    @Override
    public void delete(Integer id) {
        userMapper.deleteByPrimaryKey(id);
    }

    //查询
    @Override
    public List<User> find() {
        UserExample userExample=new UserExample();
        List<User> list= userMapper.selectByExample(userExample);
        return list ;
    }

    //根据id查询
    @Override
    public User fingByid(Integer id) {
        User user=userMapper.selectByPrimaryKey(id);
        return user;
    }

    //修改
    @Override
    public void update(User user) {

        userMapper.updateByPrimaryKey(user);

    }
}
