package com.kandytan.base.web;

import com.kandytan.base.model.BaseUserQueryVO;
import com.kandytan.base.service.BaseUserService;
import com.kandytan.test.service.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class BaseUserControl {

    private static final Logger logger = LoggerFactory.getLogger( BaseUserControl.class);
    @Resource
    private BaseUserService baseUserService;

    @RequestMapping("/selectList")
    public String selectList(HttpServletRequest request, HttpServletResponse response) {
        BaseUserQueryVO baseUserQueryVO = new BaseUserQueryVO();
        baseUserService.selectList(baseUserQueryVO);
        return "/view/test.jsp";
    }

}
