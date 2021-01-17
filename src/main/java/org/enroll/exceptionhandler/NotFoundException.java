import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

//package org.enroll.exceptionhandler;/**
// * author:高子雄
// * number:20181002989
// */
//
//import org.springframework.boot.web.servlet.error.ErrorController;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.ModelMap;
//import org.springframework.web.bind.annotation.RequestMapping;
//
///**
// * <p>
// * 树型代码表 服务实现类
// * </p>
// *
// * @author yuanfeng
// * @since 2020-03-18
// */
//
//@Controller
//public class NotFoundException implements ErrorController {
//
//    @Override
//    public String getErrorPath() {
//        return "/error";
//    }
//
//    @RequestMapping("/error")
//    public String error(ModelMap map){
//        map.addAttribute("message", "404 not found link！");
//        return "uploadStatus";
//    }
//
//}