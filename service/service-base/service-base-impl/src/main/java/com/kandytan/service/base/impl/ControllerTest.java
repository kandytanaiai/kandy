package com.kandytan.service.base.impl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Kandy Tan
 * @since 1.0
 */
@RestController
public class ControllerTest {

    @RequestMapping(value = "/getGoods")
    public String add() {
        return "getGoods is apple";
    }

}
