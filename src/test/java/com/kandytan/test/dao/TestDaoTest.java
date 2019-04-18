package com.kandytan.test.dao;

import com.kandytan.test.model.TestVO;
import com.kandytan.util.TestBase;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;

public class TestDaoTest extends TestBase {

    @Resource
    private TestDao testDao;

    @Test
    public void testGetTestVOList(){
        List<TestVO> list = testDao.getTestVOList();
        System.out.println(list.size());
    }

}
