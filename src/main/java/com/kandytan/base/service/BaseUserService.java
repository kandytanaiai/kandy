package com.kandytan.base.service;

import com.kandytan.base.model.BaseUserQueryVO;
import com.kandytan.base.model.BaseUserVO;

import java.util.List;

/**
 * 用户信息
 *
 * @author Kandy Tan
 * @since 1.0.0
 */
public interface BaseUserService {

    List<BaseUserVO> selectList(BaseUserQueryVO baseUserQueryVO);

    BaseUserVO selectOne(BaseUserQueryVO baseUserQueryVO);

    boolean insert(List<BaseUserVO> list);

    boolean insert(BaseUserVO baseUserVO);

    boolean update(List<BaseUserVO> list);

    boolean update(BaseUserVO baseUserVO);

    boolean delete(List<BaseUserVO> list);

    boolean delete(BaseUserVO baseUserVO);

}
