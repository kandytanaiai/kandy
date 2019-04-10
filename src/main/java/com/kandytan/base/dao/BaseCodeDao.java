package com.kandytan.base.dao;

import com.kandytan.base.model.BaseCodeVO;
import java.util.List;

/**
 * @author Kandy Tan
 * @since 1.0
 */
public interface BaseCodeDao {

    List<BaseCodeVO> selectList(BaseCodeVO baseCodeQueryVO);

}
