package com.ytao.per.interceptor;

import com.ytao.per.bean.TAdminAuth;
import com.ytao.per.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by ybtccc on 2018/8/17.
 */
public class AuthInterceptor implements HandlerInterceptor {

    @Autowired
    private AuthService authService;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws Exception {
        List<TAdminAuth> adminAuths = authService.listUserAuth((String)request.getSession().getAttribute("userId"));
        for(int i=0;i<adminAuths.size();i++){
            if(adminAuths.get(i).getAuthUrl().equals(request.getRequestURI())){
                return true;
            }
        }
        response.sendRedirect("error");
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
