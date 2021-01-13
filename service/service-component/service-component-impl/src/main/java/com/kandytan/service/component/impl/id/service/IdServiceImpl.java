package com.kandytan.service.component.impl.id.service;

import com.kandytan.service.component.api.service.IdService;
import com.sankuai.inf.leaf.common.Result;
import com.sankuai.inf.leaf.service.SnowflakeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class IdServiceImpl implements IdService {
    @Resource
    private SnowflakeService snowflakeService;

    @Override
    public long getId() {
        Result result = snowflakeService.getId(null);
        long id = result.getId();
        String.valueOf(id);
        String sid = String.valueOf(id);
        sid = sid.substring(1, sid.length());
        return Long.parseLong(sid);
    }
}
