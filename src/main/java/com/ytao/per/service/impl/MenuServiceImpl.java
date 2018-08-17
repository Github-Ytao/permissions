package com.ytao.per.service.impl;

import com.ytao.per.bean.TMenu;
import com.ytao.per.dao.TMenuMapper;
import com.ytao.per.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ybtccc on 2018/7/6.
 */
@Service
public class MenuServiceImpl implements MenuService {

    @Autowired
    private TMenuMapper menuMapper;

    @Override
    public List<TMenu> findMenuList() {
        return null;
    }
}
