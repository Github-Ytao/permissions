package com.ytao.per.service.impl;

import com.ytao.per.bean.TAdminRole;
import com.ytao.per.bean.TUserRole;
import com.ytao.per.dao.TAdminRoleMapper;
import com.ytao.per.dao.TUserRoleMapper;
import com.ytao.per.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by ybtccc on 2018/8/17.
 */
public class RoleServiceImpl implements RoleService {

    @Autowired
    private TAdminRoleMapper roleMapper;
    @Autowired
    private TUserRoleMapper userRoleMapper;

    @Override
    public Integer addRole(TAdminRole role) {
        return roleMapper.insert(role);
    }

    @Override
    public Integer updateRole(TAdminRole role) {
        return roleMapper.update(role);
    }

    @Override
    public Integer delRole(String id) {
        return roleMapper.deleteById(id);
    }

    @Override
    public List<TAdminRole> listRole(TAdminRole role, int page, int pageSize) {
        return roleMapper.selectByPage(role,page,pageSize);
    }

    @Override
    public TAdminRole findRole(String id) {
        return roleMapper.selectById(id);
    }

    @Override
    public Integer deleteUserRoleByUserId(String userId) {
        return userRoleMapper.deleteUserRoleByUserId(userId);
    }
}
