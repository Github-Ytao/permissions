package com.ytao.per.controller;

import com.ytao.per.bean.TAdminAuth;
import com.ytao.per.bean.TRoleAuth;
import com.ytao.per.bean.TUserRole;
import com.ytao.per.service.AuthService;
import com.ytao.per.service.RoleService;
import com.ytao.per.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.annotation.RequestScope;

import javax.management.relation.Role;
import java.util.List;


/**
 * Created by ybtccc on 2018/8/17.
 */
@Controller
public class AuthController {

    @Autowired
    private  AuthService authService;
    @Autowired
    private RoleService roleService;

    @RequestMapping("/add")
    @ResponseBody
    Result add(@RequestParam TAdminAuth auth){
        authService.addAuth(auth);
        return Result.success();
    }
    @RequestMapping("/uodate")
    @ResponseBody
    Result uodate(@RequestParam TAdminAuth auth){
        authService.updateAuth(auth);
        return Result.success();
    }

    @RequestMapping("/del")
    @ResponseBody
    Result del(@RequestParam String id){
        authService.delAuth(id);
        return Result.success();
    }

    @RequestMapping("/list")
    @ResponseBody
    Result list(@RequestParam int page,@RequestParam(required = false,defaultValue = "10") int pageSize,@RequestParam TAdminAuth auth){
        List<TAdminAuth> list = authService.listAuth(auth,page,pageSize);
        return Result.success(list);
    }

    @RequestMapping("/findAuth")
    @ResponseBody
    Result findAuth(@RequestParam String id){
        TAdminAuth auth = authService.findAuth(id);
        return Result.success(auth);
    }

    @RequestMapping("/addUserRole")
    Result addUserRole(@RequestParam TUserRole userRole) {
        roleService.deleteUserRoleByUserId(userRole.getUserId());
        String[] roleIds = userRole.getRoleId().split(",");
        for (int i = 0; i < roleIds.length; i++) {
            TUserRole tem = new TUserRole();
            tem.setRoleId(roleIds[i]);
            tem.setUserId(userRole.getUserId());
            authService.addUserRole(tem);
        }
        return Result.success();
    }

    @RequestMapping("/addRoleAuth")
    Result addRoleAuth(@RequestParam TRoleAuth roleAuth) {
        authService.deleteRoleAuthByRoleId(roleAuth.getRoleId());
        String[] authIds = roleAuth.getAuthId().split(",");
        for (int i = 0; i < authIds.length; i++) {
            TRoleAuth roleAuth1 = new TRoleAuth();
            roleAuth1.setAuthId(authIds[i]);
            roleAuth1.setRoleId(roleAuth.getRoleId());
            authService.addRoleAuth(roleAuth1);
        }
        return Result.success();
    }
}
