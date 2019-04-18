package com.kandytan.base.service;

import com.kandytan.base.model.BaseUserQueryVO;
import com.kandytan.base.model.BaseUserVO;
import com.kandytan.util.OperResult;
import com.kandytan.util.Pager;
import com.kandytan.util.UUID;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:springContext.xml"})
public class BaseUserServiceTest {

    @Resource
    private BaseUserService baseUserService;

//    @Test
    public void testSelectList() {
        BaseUserQueryVO baseUserQueryVO = new BaseUserQueryVO();
        List<BaseUserVO> baseUserVOList = baseUserService.selectList(baseUserQueryVO);
        Assert.assertNotNull(baseUserVOList);
    }

//    @Test
    public void testSelectPager() {
        BaseUserQueryVO baseUserQueryVO = new BaseUserQueryVO();
        baseUserQueryVO.setPager(new Pager());
        Pager<BaseUserVO> pager = baseUserService.selectPager(baseUserQueryVO);
        Assert.assertNotNull(pager);
    }

//    @Test
    public void testSelectOne() {
        BaseUserQueryVO baseUserQueryVO = new BaseUserQueryVO();
        BaseUserVO baseUserVO = baseUserService.selectOne(baseUserQueryVO);
        Assert.assertNotNull(baseUserVO);
    }

//    @Test
    public void testInsert() {
        BaseUserVO baseUserVO = new BaseUserVO();
        baseUserVO.setUserId(UUID.getUUID());
        baseUserVO.setUserName("张老三");
        baseUserVO.setUserTypeId(1);
        baseUserVO.setSexId(0);
        baseUserVO.setTel("18520963830");
        baseUserVO.setEmail("kandytanaiai@163.com");
        if (!baseUserVO.validate()) {
            Assert.assertTrue(false);
            return;
        }
        OperResult<BaseUserVO> result = baseUserService.insert(baseUserVO);
        Assert.assertTrue(result.isFlag());
    }

//    @Test
    public void testUpdate() {
        BaseUserQueryVO baseUserQueryVO = new BaseUserQueryVO();
        List<BaseUserVO> list = baseUserService.selectList(baseUserQueryVO);
        BaseUserVO baseUserVO = list.get(0);
        baseUserVO.setUserName("弹指间");
        if (!baseUserVO.validate()) {
            Assert.assertTrue(false);
            return;
        }
        OperResult<BaseUserVO> result = baseUserService.update(baseUserVO);
        Assert.assertTrue(result.isFlag());
    }

//    @Test
    public void testDelete() {
        BaseUserQueryVO baseUserQueryVO = new BaseUserQueryVO();
        List<BaseUserVO> list = baseUserService.selectList(baseUserQueryVO);
        List<String> ids = new ArrayList<String>();
        ids.add(list.get(0).getUserId());
        OperResult<List<String>> result = baseUserService.delete(ids);
        Assert.assertTrue(result.isFlag());
    }

}
