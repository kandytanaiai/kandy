package com.kandytan.service.mall.impl.web;

import com.kandytan.base.util.Pager;
import com.kandytan.service.mall.api.model.MallGoodsQueryVO;
import com.kandytan.service.mall.api.model.MallGoodsVO;
import com.kandytan.service.mall.api.service.MallGoodsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author tanjianqin
 * @since 1.0
 */
@Controller
public class MallGoodsControl {

    private static final Logger logger = LoggerFactory.getLogger(MallGoodsControl.class);
    @Resource
    private MallGoodsService mallGoodsService;

    @RequestMapping("/selectPager")
    public @ResponseBody
    Pager<MallGoodsVO> selectPager(HttpServletRequest request, HttpServletResponse response, @RequestBody MallGoodsQueryVO mallGoodsQueryVO) {
        Pager<MallGoodsVO> pager = mallGoodsService.selectPager(mallGoodsQueryVO);
        return pager;
    }

}
