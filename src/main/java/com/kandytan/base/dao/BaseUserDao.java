package com.kandytan.base.dao;

import com.kandytan.base.model.BaseUserVO;
import com.kandytan.base.model.BaseUserQueryVO;
import com.kandytan.util.Pager;

import java.util.List;

/**
 * 用户信息
 * @author Kandy Tan
 * @since 1.0.0
 */
public interface BaseUserDao {

    List<BaseUserVO> selectList(BaseUserQueryVO baseUserQueryVO) throws Exception;

    Pager<BaseUserVO> selectPager(BaseUserQueryVO baseUserQueryVO, int currPage, int pageSize) throws Exception;

    boolean insert(List<BaseUserVO> list) throws Exception;

    boolean update(List<BaseUserVO> list) throws Exception;

    boolean delete(List<String> userIdList) throws Exception;

}
