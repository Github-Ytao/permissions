package com.ytao.per.service;

import com.ytao.per.bean.TAdminAuth;
import com.ytao.per.bean.TRoleAuth;
import com.ytao.per.bean.TUserRole;

import java.util.List;

/**
 * Created by ybtccc on 2018/8/17.
 */
public interface AuthService {

    void addAuth(TAdminAuth auth);

    void updateAuth(TAdminAuth auth);

    void delAuth(String id);

    List<TAdminAuth> listAuth(TAdminAuth auth, int page, int pageSize);

    TAdminAuth findAuth(String id);

    Integer addUserRole(TUserRole userRole);

    Integer deleteRoleAuthByRoleId(String roleId);

    void addRoleAuth(TRoleAuth roleAuth1);

    List<TAdminAuth> listUserAuth(String userId);
}
