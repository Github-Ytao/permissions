package com.ytao.per.controller;

import com.ytao.per.pojo.Auth;
import com.ytao.per.pojo.Role;
import com.ytao.per.service.RoleService;
import com.ytao.per.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by ybtccc on 2018/8/17.
 */
@Controller
public class RoleController {

    @Autowired
    private RoleService roleService;

    @RequestMapping("/add")
    @ResponseBody
    Result add(@RequestParam Role role){
        roleService.addRole(role);
        return Result.success();
    }
    @RequestMapping("/uodate")
    @ResponseBody
    Result uodate(@RequestParam Role role){
        roleService.updateRole(role);
        return Result.success();
    }

    @RequestMapping("/del")
    @ResponseBody
    Result del(@RequestParam Role role){
        roleService.delRole(role.getId());
        return Result.success();
    }

    @RequestMapping("/list")
    @ResponseBody
    Result list(@RequestParam int page,@RequestParam(required = false,defaultValue = "10") int pageSize,@RequestParam Role role){
        List<Role> list = roleService.listRole(role,page,pageSize);
        return Result.success(list);
    }

    @RequestMapping("/findAuth")
    @ResponseBody
    Result findRole(@RequestParam String id){
        Role role = roleService.findRole(id);
        return Result.success(role);
    }

}
