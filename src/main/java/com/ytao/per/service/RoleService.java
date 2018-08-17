package com.ytao.per.service;


import com.ytao.per.bean.TAdminRole;

import java.util.List;

/**
 * Created by ybtccc on 2018/8/17.
 */
public interface RoleService {
    Integer addRole(TAdminRole role);

    Integer updateRole(TAdminRole role);

    Integer delRole(String id);

    List<TAdminRole> listRole(TAdminRole role, int page, int pageSize);

    TAdminRole findRole(String id);

    Integer deleteUserRoleByUserId(String userId);
}
