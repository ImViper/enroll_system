package org.enroll.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class MainsiteErrorController implements ErrorController {
    Logger logger = LoggerFactory.getLogger(MainsiteErrorController.class);

    private final String ERROR_PATH ="/error";

    /**
     * 出现错误，跳转到如下映射中
     * @return
     */
    @Override
    public String getErrorPath() {
        return ERROR_PATH;
    }

    /**
     * Web页面错误处理
     */
    @RequestMapping(value = ERROR_PATH)
    public ModelAndView errorHtml(HttpServletRequest request, HttpServletResponse response) {
        int code = response.getStatus();
        if (404 == code) {
            return new ModelAndView("404.html");
        } else {
            return new ModelAndView("505.html");
        }
    }



}
