package sg.nus.edu.logininterceptor.config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import sg.nus.edu.logininterceptor.interceptor.ProtectedPageInterceptor;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
  @Autowired
  ProtectedPageInterceptor protectedPageInterceptor;

  @Override
  public void addInterceptors(InterceptorRegistry registry) {
    registry.addInterceptor(protectedPageInterceptor);
  }
}
