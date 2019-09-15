package wjf.mistyr.com.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Author wjf
 * @date 2019/9/15 16:28
 */
@Configuration
public class MvcConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry viewControllerRegistry){
        viewControllerRegistry.addViewController("register").setViewName("register");
        viewControllerRegistry.addViewController("login").setViewName("login");
        viewControllerRegistry.addViewController("index.html").setViewName("index");
    }
}
