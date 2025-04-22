package sg.nus.edu.logininterceptor.interceptor;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class ProtectedPageInterceptor implements HandlerInterceptor {
  @Override
  public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object hander){
    Object isLoggedIn = request.getSession().getAttribute("isLoggedIn");
    System.out.println(isLoggedIn);
    return true;
  }
}
