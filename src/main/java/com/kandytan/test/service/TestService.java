package com.kandytan.test.service;

import com.kandytan.test.dao.TestDao;
import com.kandytan.test.model.TestVO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TestService {

    @Resource
    private TestDao testDao;

    public List<TestVO> getTestVOList() {
        return  testDao.getTestVOList();
    }

}
