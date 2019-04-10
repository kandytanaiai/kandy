package com.kandytan.base.dao;

import com.kandytan.base.model.BaseCodeVO;
import com.kandytan.base.model.BaseUserVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Kandy Tan
 * @since 1.0
 */
@Repository
public class BaseCodeDaoImpl implements BaseCodeDao {

    @Resource
    private SqlSessionTemplate sqlSessionTemplate;

    @Override
    public List<BaseCodeVO> selectList(BaseCodeVO baseCodeQueryVO) {
        List<BaseCodeVO> baseCodeVOList = sqlSessionTemplate.selectList(BaseCodeVO.class.getName() + ".selectList", baseCodeQueryVO);
        return baseCodeVOList;
    }
}
