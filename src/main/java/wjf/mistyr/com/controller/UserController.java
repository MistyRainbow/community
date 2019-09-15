package wjf.mistyr.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import wjf.mistyr.com.domain.User;
import wjf.mistyr.com.repository.UserRepository;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @Author wjf
 * @date 2019/9/15 16:16
 */
@Controller
public class UserController {
    @Autowired
    UserRepository userRepository;

    //实现注册功能
    @PostMapping("/user/handleRegister")
    public String handleRegister(User user){
        userRepository.save(user);//UserRepository自带简单的sql语句，即insert into...
        return "login";
    }


    //实现登陆功能
    @PostMapping("/user/handleLogin")
    public String handleLogin(@RequestParam("username") String username, @RequestParam("password") String password, HttpSession session, Map<String,Object> map){
        User user = userRepository.findByUsernameAndPassword(username, password);
        if (user != null){
            session.setAttribute("username",user.getUsername());
            return "redirect:/index.html"; //redirect重定向到主页
        }else{
            //向页面输出内容
            map.put("msg","用户名或密码错误");
            return "login";
        }
    }
}
