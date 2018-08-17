package com.ytao.per.controller;

import com.ytao.per.bean.TAdminUser;
import com.ytao.per.bean.TMenu;
import com.ytao.per.service.LoginService;
import com.ytao.per.service.MenuService;
import com.ytao.per.util.BizException;
import com.ytao.per.util.Result;
import com.ytao.per.vo.UserVo;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ybtccc on 2018/7/5.
 */
@Controller
public class IndexController {

    @Autowired
    private MenuService menuService;
    @Autowired
    private LoginService loginService;

    @RequestMapping("/login")
    Result login(@RequestParam String username, @RequestParam String password) {
        Result  result = Result.success();
        try {
            TAdminUser user = loginService.login(username, password);
            UserVo userVo = new UserVo();
            BeanUtils.copyProperties(user,userVo);
            result.setData(userVo);
        } catch (BizException e) {
            result =  Result.error(e.getCode(),e.getMessage());
        }
        return result;
    }

    @RequestMapping("/index")
    String index(HttpServletRequest request) {
        List<TMenu> menuList = menuService.findMenuList();
        List<TMenu> childs = new ArrayList<>();
        if(menuList!=null && !menuList.isEmpty()) {
            for(TMenu menu : menuList) {
                if(StringUtils.isNotBlank(menu.getParentId())) {
                    childs.add(menu);
                }
            }
        }
        request.setAttribute("menuList", menuList);
        request.setAttribute("childs", childs);
        return "index";
    }

}
