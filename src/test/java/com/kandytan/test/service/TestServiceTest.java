package com.kandytan.test.service;

import com.kandytan.test.model.TestVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:springContext.xml"})
public class TestServiceTest {

    @Resource
    private TestService testService;

    @Test
    public void testGetTestVOList(){
        List<TestVO> list = testService.getTestVOList();
        System.out.println(list.size());
    }

}
