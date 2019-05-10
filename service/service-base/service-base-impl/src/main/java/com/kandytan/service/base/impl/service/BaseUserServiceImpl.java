package com.kandytan.service.base.impl.service;

import com.kandytan.base.util.OperResult;
import com.kandytan.base.util.Pager;
import com.kandytan.service.base.api.model.BaseUserQueryVO;
import com.kandytan.service.base.api.model.BaseUserVO;
import com.kandytan.service.base.api.service.BaseUserService;

import java.util.List;

/**
 * @author Kandy Tan
 * @since 1.0
 */
public class BaseUserServiceImpl implements BaseUserService {
    @Override
    public List<BaseUserVO> selectList(BaseUserQueryVO baseUserQueryVO) {
        return null;
    }

    @Override
    public Pager<BaseUserVO> selectPager(BaseUserQueryVO baseUserQueryVO) {
        return null;
    }

    @Override
    public BaseUserVO selectOne(BaseUserQueryVO baseUserQueryVO) {
        return null;
    }

    @Override
    public boolean noExist(BaseUserQueryVO baseUserQueryVO) {
        return false;
    }

    @Override
    public OperResult<BaseUserVO> insert(BaseUserVO baseUserVO) {
        return null;
    }

    @Override
    public OperResult<BaseUserVO> update(BaseUserVO baseUserVO) {
        return null;
    }

    @Override
    public OperResult<List<String>> delete(List<String> userIds) {
        return null;
    }
}
