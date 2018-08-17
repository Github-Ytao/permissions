package com.ytao.per.service;

import com.ytao.per.bean.TAdminUser;
import com.ytao.per.util.BizException;
import com.ytao.per.util.Result;

/**
 * Created by ybtccc on 2018/8/17.
 */
public interface LoginService {

    TAdminUser login(String username, String password) throws BizException;
}
