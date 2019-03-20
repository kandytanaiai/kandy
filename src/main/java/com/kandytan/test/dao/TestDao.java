package com.kandytan.test.dao;

import com.kandytan.test.model.TestVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 *
 * @author Kandy Tan
 * @since 1.0.0
 */
@Repository
public class TestDao {

    @Resource
    private SqlSessionTemplate sqlSessionTemplate;

    public List<TestVO> getTestVOList() {
        List<TestVO> list = sqlSessionTemplate.selectList("com.kandytan.test.model.TestVO.selectTest");
        return  list;
    }

}
