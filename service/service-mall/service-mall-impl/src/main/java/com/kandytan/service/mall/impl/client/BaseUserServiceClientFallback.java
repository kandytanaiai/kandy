package com.kandytan.service.mall.impl.client;

import com.kandytan.base.util.Pager;
import com.kandytan.service.base.api.model.BaseUserQueryVO;
import com.kandytan.service.base.api.model.BaseUserVO;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author tanjianqin
 * @since 1.0
 */
public class BaseUserServiceClientFallback implements BaseUserServiceClient {
    @Override
    public Pager<BaseUserVO> selectPager(BaseUserQueryVO baseUserQueryVO) {
        return new Pager<BaseUserVO>();
    }
}
