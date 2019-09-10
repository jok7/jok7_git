package com.maven.controller;

import com.maven.pojo.User;
import com.maven.seivce.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/user")
public class ControllerUser {

    @Autowired
    private UserService userService;

    //查询
    @RequestMapping("/find")
    public  String  find(Model model){

        List<User> list= userService.find();

        model.addAttribute("lists",list);
        return  "userlist";
    }
    
    //删除
    @RequestMapping("/delete")
    public String delete(Integer id){
        userService.delete(id);
        return  "redirect:find";
    }
    //根据id查询
    @RequestMapping("/selectbyid")
    public String selectbyid(Integer id,Model model){
          User user=userService.fingByid(id);

        model.addAttribute("users", user);

        return "update";
    }
    //修改
    @RequestMapping("/update")
    public  String update(User user){
         userService.update(user);

         return  "redirect:find";
    }

    //跳转到添加页面
    @RequestMapping("/tiaoadd")
    public  String tiaoadd(){
        return  "useradd";
    }

    //添加
    @RequestMapping("/add")
    public String add(Model model,User user){
        userService.add(user);

        return "redirect:find";
    }
}
