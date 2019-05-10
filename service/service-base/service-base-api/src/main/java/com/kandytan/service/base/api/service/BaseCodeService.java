package com.kandytan.service.base.api.service;

import com.kandytan.service.base.api.model.BaseCodeVO;

import java.util.List;

/**
 * @author Kandy Tan
 * @since 1.0
 */
public interface BaseCodeService {

    List<BaseCodeVO> selectList(BaseCodeVO baseCodeQueryVO);

}
