package com.kandytan.service.mall.impl.web;

import com.kandytan.base.util.Pager;
import com.kandytan.service.base.api.model.BaseUserQueryVO;
import com.kandytan.service.base.api.model.BaseUserVO;
import com.kandytan.service.mall.api.model.MallGoodsQueryVO;
import com.kandytan.service.mall.api.model.MallGoodsVO;
import com.kandytan.service.mall.api.service.MallGoodsService;
import com.kandytan.service.mall.impl.client.BaseUserServiceClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @author tanjianqin
 * @since 1.0
 */
@Controller
@RequestMapping(value = "/goods/")
public class MallGoodsControl {

    private static final Logger logger = LoggerFactory.getLogger(MallGoodsControl.class);
    @Resource
    private MallGoodsService mallGoodsService;
    @Autowired
    private BaseUserServiceClient baseUserServiceClient;

    @RequestMapping("selectPager")
    public @ResponseBody
    Pager<MallGoodsVO> selectPager(HttpServletRequest request, HttpServletResponse response, @RequestBody MallGoodsQueryVO mallGoodsQueryVO) {
        Pager<MallGoodsVO> pager = mallGoodsService.selectPager(mallGoodsQueryVO);
        BaseUserQueryVO baseUserQueryVO  = new BaseUserQueryVO();
        baseUserQueryVO.setPager(new Pager());
        Pager<BaseUserVO> userPager = baseUserServiceClient.selectPager(baseUserQueryVO);
        List<BaseUserVO> baseUserVOList = userPager.getDataList();
        System.out.println(baseUserVOList.size());

        return pager;
    }

    @RequestMapping("selectUserPager")
    public @ResponseBody
    Pager<BaseUserVO> selectUserPager(HttpServletRequest request, HttpServletResponse response, @RequestBody BaseUserQueryVO baseUserQueryVO) {
        Pager<BaseUserVO> userPager = baseUserServiceClient.selectPager(baseUserQueryVO);
        List<BaseUserVO> baseUserVOList = userPager.getDataList();
        System.out.println(baseUserVOList.size());

        return userPager;
    }


}
