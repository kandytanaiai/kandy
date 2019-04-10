package com.kandytan.base.service;

import com.kandytan.base.model.BaseCodeVO;

import java.util.List;

/**
 * @author Kandy Tan
 * @since 1.0
 */
public interface BaseCodeService {

    List<BaseCodeVO> selectList(BaseCodeVO baseCodeQueryVO);

}
