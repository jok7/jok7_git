package com.maven.seivce;
import com.maven.pojo.User;

import java.util.List;

public interface UserService {

    public  void add(User user);//添加
    public  void delete(Integer id);//删除
    public  List<User> find();//查询
    public  User fingByid(Integer id);//根据id查询
    public  void update(User user);//修改
}
