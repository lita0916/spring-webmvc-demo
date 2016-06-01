package com.lita.demo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by admin on 2016/5/31.
 */
@Controller
public class ThymeleafController {
    @RequestMapping({"/", "/thymeleaf"})
    public String thymeleaf(Model model) {
        return "hello.html";
    }

}
