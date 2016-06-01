package com.lita.demo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by admin on 2016/5/31.
 */
@Controller
public class JSPController {

    @RequestMapping("/jsp")
    public String hello(Model model) {
        return "hello.jsp";
    }
}
