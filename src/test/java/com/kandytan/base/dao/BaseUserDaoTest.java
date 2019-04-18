package com.kandytan.base.dao;

import com.kandytan.base.model.BaseUserQueryVO;
import com.kandytan.base.model.BaseUserVO;
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
public class BaseUserDaoTest {

    @Resource
    private BaseUserDao baseUserDao;

//    @Test
    public void testSelectList() {
        BaseUserQueryVO baseUserVOQuery = new BaseUserQueryVO();
        baseUserVOQuery.setUserId("tes");
        List<BaseUserVO> baseUserVOList = null;
        try {
            baseUserVOList = baseUserDao.selectList(baseUserVOQuery);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Assert.assertNotNull(baseUserVOList);
    }

//    @Test
    public void testSelectPager() {
        BaseUserQueryVO baseUserVOQuery = new BaseUserQueryVO();
        baseUserVOQuery.setUserId("tes");
        Pager<BaseUserVO> pager = null;
        try {
            pager = baseUserDao.selectPager(baseUserVOQuery, 1, 5);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Assert.assertNotNull(pager);
    }

//        @Test
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
        List<BaseUserVO> list = new ArrayList<BaseUserVO>();
        list.add(baseUserVO);
        boolean result = false;
        try {
            result = baseUserDao.insert(list);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Assert.assertTrue(result);
    }

    //    @Test
    public void testUpdate() {
        BaseUserQueryVO baseUserQueryVO = new BaseUserQueryVO();
        List<BaseUserVO> list = null;
        try {
            list = baseUserDao.selectList(baseUserQueryVO);
        } catch (Exception e) {
            e.printStackTrace();
        }
        BaseUserVO baseUserVO = list.get(0);
        baseUserVO.setUserName("弹指间");
        if (!baseUserVO.validate()) {
            Assert.assertTrue(false);
            return;
        }
        boolean result = false;
        try {
            result = baseUserDao.update(list);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Assert.assertTrue(result);
    }

    //    @Test
    public void testDelete() {
        BaseUserQueryVO baseUserQueryVO = new BaseUserQueryVO();
        try {
            List<BaseUserVO> baseUserVOList = baseUserDao.selectList(baseUserQueryVO);
            BaseUserVO baseUserVO = baseUserVOList.get(0);
            List<String> list = new ArrayList<String>();
            list.add(baseUserVO.getUserId());

            boolean result = baseUserDao.delete(list);
            Assert.assertTrue(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
