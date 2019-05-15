package com.kandytan.service.base.impl.dao;

import com.kandytan.base.util.Pager;
import com.kandytan.service.base.api.model.BaseUserQueryVO;
import com.kandytan.service.base.api.model.BaseUserVO;

import java.util.List;

/**
 * @author Kandy Tan
 * @since 1.0
 */
public interface BaseUserDao {

    List<BaseUserVO> selectList(BaseUserQueryVO baseUserQueryVO) throws Exception;

    Pager<BaseUserVO> selectPager(BaseUserQueryVO baseUserQueryVO, int currPage, int pageSize) throws Exception;

    boolean insert(List<BaseUserVO> list) throws Exception;

    boolean update(List<BaseUserVO> list) throws Exception;

    boolean delete(List<String> userIdList) throws Exception;

}
