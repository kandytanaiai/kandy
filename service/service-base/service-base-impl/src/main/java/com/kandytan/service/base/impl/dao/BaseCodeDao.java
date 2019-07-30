package com.kandytan.service.base.impl.dao;

import com.kandytan.service.base.api.model.BaseCodeVO;

import java.util.List;

/**
 * @author Kandy Tan
 * @since 1.0
 */
public interface BaseCodeDao {

    List<BaseCodeVO> selectList(BaseCodeVO baseCodeQueryVO);

}
