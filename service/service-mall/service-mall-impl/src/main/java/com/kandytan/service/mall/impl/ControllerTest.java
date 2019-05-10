package com.kandytan.service.mall.impl;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Kandy Tan
 * @since 1.0
 */
@FeignClient(name = "provider")
public interface ControllerTest {

    @GetMapping(value = "/getGoods")
    String add();

}
