package com.kandytan.service.mall.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Kandy Tan
 * @since 1.0
 */
@RestController
public class ConsumerController {

    @Autowired
    private ControllerTest controllerTest;

    @RequestMapping("/getresult")
    public String getResult() {
        return "getResult: " + controllerTest.add();
    }

}
