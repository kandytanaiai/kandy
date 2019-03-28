package com.kandytan.base.service;

import com.kandytan.base.model.BaseUserQueryVO;
import com.kandytan.base.model.BaseUserVO;
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

    Pager<BaseUserVO> selectPager(BaseUserQueryVO baseUserQueryVO, int currPage, int pageSize);

    BaseUserVO selectOne(BaseUserQueryVO baseUserQueryVO);

    boolean insert(List<BaseUserVO> list);

    boolean insert(BaseUserVO baseUserVO);

    boolean update(List<BaseUserVO> list);

    boolean update(BaseUserVO baseUserVO);

    boolean delete(List<String> userIds);

    boolean delete(String userId);

}
