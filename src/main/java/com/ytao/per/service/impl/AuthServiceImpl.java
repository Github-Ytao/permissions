package com.ytao.per.service.impl;

import com.ytao.per.bean.TAdminAuth;
import com.ytao.per.bean.TRoleAuth;
import com.ytao.per.bean.TUserRole;
import com.ytao.per.dao.TAdminAuthMapper;
import com.ytao.per.dao.TRoleAuthMapper;
import com.ytao.per.dao.TUserRoleMapper;
import com.ytao.per.service.AuthService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by ybtccc on 2018/8/17.
 */
public class AuthServiceImpl implements AuthService {

    @Autowired
    private TAdminAuthMapper authMapper;
    @Autowired
    private TUserRoleMapper userRoleMapper;
    @Autowired
    private TRoleAuthMapper roleAuthMapper;

    @Override
    public void addAuth(TAdminAuth auth) {
        authMapper.insert(auth);
    }

    @Override
    public void updateAuth(TAdminAuth auth) {
        authMapper.update(auth);
    }

    @Override
    public void delAuth(String id) {
        authMapper.deleteById(id);
    }

    @Override
    public List<TAdminAuth> listAuth(TAdminAuth auth, int page, int pageSize) {
        return authMapper.selectByPage(auth,(page-1)*pageSize,pageSize);
    }

    @Override
    public TAdminAuth findAuth(String id) {
        return authMapper.selectById(id);
    }

    @Override
    public Integer addUserRole(TUserRole userRole) {
        return userRoleMapper.insert(userRole);
    }

    @Override
    public Integer deleteRoleAuthByRoleId(String roleId) {
        return roleAuthMapper.deleteRoleAuthByRoleId(roleId);
    }

    @Override
    public void addRoleAuth(TRoleAuth roleAuth1) {
        roleAuthMapper.insert(roleAuth1);
    }

    @Override
    public List<TAdminAuth> listUserAuth(String userId) {

        return authMapper.listUserAuth(userId);
    }


}
