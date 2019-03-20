package com.kandytan.test.web;

import com.kandytan.test.dao.TestDao;
import com.kandytan.test.model.TestVO;
import com.kandytan.test.service.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
public class TestControl {

    private static final Logger logger = LoggerFactory.getLogger( TestControl.class);

    @Resource
    private TestService testService;

    @RequestMapping("/test")
    public String test(HttpServletRequest request, HttpServletResponse response) {
        List<TestVO> list = testService.getTestVOList();
        System.out.println(list.size());

        logger.debug("debug level");
        logger.info("info level");
        logger.warn("warn level");
        logger.error("error level");

        request.setAttribute("testVOList", list);
        return "/view/test.jsp";
    }

}
