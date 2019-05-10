package com.kandytan.service.base.api.service;

import com.kandytan.base.util.OperResult;
import com.kandytan.base.util.Pager;
import com.kandytan.service.base.api.model.BaseUserQueryVO;
import com.kandytan.service.base.api.model.BaseUserVO;

import java.util.List;

/**
 * @author Kandy Tan
 * @since 1.0
 */
public interface BaseUserService {

    List<BaseUserVO> selectList(BaseUserQueryVO baseUserQueryVO);

    Pager<BaseUserVO> selectPager(BaseUserQueryVO baseUserQueryVO);

    BaseUserVO selectOne(BaseUserQueryVO baseUserQueryVO);

    boolean noExist(BaseUserQueryVO baseUserQueryVO);

    OperResult<BaseUserVO> insert(BaseUserVO baseUserVO);

    OperResult<BaseUserVO> update(BaseUserVO baseUserVO);

    OperResult<List<String>> delete(List<String> userIds);

}
