package com.ytao.per.service.impl;

import com.ytao.per.bean.TAdminUser;
import com.ytao.per.dao.TAdminUserMapper;
import com.ytao.per.service.LoginService;
import com.ytao.per.util.BizException;
import com.ytao.per.util.Result;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by ybtccc on 2018/8/17.
 */
public class LoginServiceImpl implements LoginService {

    @Autowired
    private TAdminUserMapper adminUserMapper;

    @Override
    public TAdminUser login(String username, String password) throws BizException {
        TAdminUser user = adminUserMapper.selectByUsername(username);
        if(username.equals(user.getUsername()) && password.equals(user.getPassword())){
            Result.success().setMsg("登陆成功！");
        }else{
            throw new BizException("201","账号或密码不正确");
        }
        return user;
    }
}
