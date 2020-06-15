package com.lmq.demo.controller;

import com.lmq.demo.base.BaseController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.sql.DataSource;

@Controller
@RequestMapping("hello")
public class HelloController extends BaseController {


    @Autowired
    DataSource dataSource;

    @RequestMapping("/index")
    public String index(){
        logger.info(dataSource.getClass().toString());
        logger.info("1234");

        return "index";
    }


}
