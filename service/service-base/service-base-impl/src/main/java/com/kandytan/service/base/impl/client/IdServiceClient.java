package com.kandytan.service.base.impl.client;

import com.kandytan.base.util.Pager;
import com.kandytan.service.base.api.model.BaseUserQueryVO;
import com.kandytan.service.base.api.model.BaseUserVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author tanjianqin
 * @since 1.0
 */
@FeignClient(value = "component", fallback = IdClientFallback.class)
public interface IdServiceClient {

    @RequestMapping("/component/id/getId")
    public @ResponseBody
    Long getId();

}
