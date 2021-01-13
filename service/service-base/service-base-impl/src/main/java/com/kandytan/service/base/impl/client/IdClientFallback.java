package com.kandytan.service.base.impl.client;

import com.kandytan.base.util.Pager;
import com.kandytan.service.base.api.model.BaseUserQueryVO;
import com.kandytan.service.base.api.model.BaseUserVO;

/**
 * @author tanjianqin
 * @since 1.0
 */
public class IdClientFallback implements IdServiceClient {
    @Override
    public Long getId(){
        return null;
    }
}
