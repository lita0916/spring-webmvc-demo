package com.lita.demo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by admin on 2016/5/31.
 */
@Controller
public class FreemarkerController {

    @RequestMapping( "/freemarker")
    public String freemarker() {
        setTitle("标题-freemarker");
        setNum("数字-freemarker");
        return "index.ftl";
    }

    private String  title;
    private String  num;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }
}
