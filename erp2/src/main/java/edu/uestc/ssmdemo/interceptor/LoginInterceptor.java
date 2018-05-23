package edu.uestc.ssmdemo.interceptor;

import edu.uestc.ssmdemo.entity.Userinfo;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Enumeration;

public class LoginInterceptor  implements HandlerInterceptor{
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        String[] ignoreURI = new String[]{"login","producer_log"};
        String url = httpServletRequest.getRequestURI();
        boolean loginFlag = false;
        for(String s: ignoreURI){
            if(url.contains(s)){
                loginFlag = true;
                break;
            }
        }
        if (!loginFlag){//被拦截了
            HttpSession httpSession = httpServletRequest.getSession();
            if(httpSession.getAttribute("user") != null){
                Userinfo user = (Userinfo) httpSession.getAttribute("user");
//                System.out.println("拦截器：" + user.getUserPhoneno() + " " + user.getUserPhoneno());
                loginFlag = true;
            }else if (httpSession.getAttribute("producer") != null){
                loginFlag = true;
            }else if (url.contains("producer")){
                //需要将taskno传入session，如果登录成功后获取taskno进行操作
                String[] tasknos = httpServletRequest.getParameterValues("taskno");
                if (tasknos != null && tasknos.length > 0){
                    httpSession.setAttribute("taskno",tasknos[0]);
                }
                httpServletRequest.getRequestDispatcher("/WEB-INF/jsp/producer/login.jsp").forward(httpServletRequest,httpServletResponse);
            }else {
                httpServletRequest.getRequestDispatcher("/WEB-INF/jsp/login/login.jsp").forward(httpServletRequest,httpServletResponse);
            }
        }
        return loginFlag;
    }

    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
