package com.kandytan.service.mall.impl.web;

import com.kandytan.service.mall.api.service.MallOrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * @author tanjianqin
 * @since 1.0
 */
@Controller
public class MallOrderControl {

    private static final Logger logger = LoggerFactory.getLogger(MallOrderControl.class);
    @Resource
    private MallOrderService mallOrderService;

}
