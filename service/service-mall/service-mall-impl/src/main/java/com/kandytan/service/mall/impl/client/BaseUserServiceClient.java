package com.kandytan.service.mall.impl.client;

import com.kandytan.base.util.Pager;
import com.kandytan.service.base.api.model.BaseUserQueryVO;
import com.kandytan.service.base.api.model.BaseUserVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author tanjianqin
 * @since 1.0
 */
@FeignClient(value = "base", fallback = BaseUserServiceClientFallback.class)
public interface BaseUserServiceClient {

    @RequestMapping("/user/selectPager")
    public @ResponseBody
    Pager<BaseUserVO> selectPager(@RequestBody BaseUserQueryVO baseUserQueryVO);

}
