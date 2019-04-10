package com.kandytan.base.service;

import com.kandytan.base.model.BaseUserQueryVO;
import com.kandytan.base.model.BaseUserVO;
import com.kandytan.util.BusException;
import com.kandytan.util.OperResult;
import com.kandytan.util.Pager;

import java.util.List;

/**
 * 用户信息
 *
 * @author Kandy Tan
 * @since 1.0.0
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
