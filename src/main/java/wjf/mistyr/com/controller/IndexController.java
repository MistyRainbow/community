package wjf.mistyr.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author wjf
 * @date 2019/9/14 15:24
 */
@Controller
public class IndexController {

    @GetMapping("/")
    public String hello(){
        return "Index";
    }

}
