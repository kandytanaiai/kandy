package com.kandytan.base.service;

import com.kandytan.base.dao.BaseUserDao;
import com.kandytan.base.model.BaseUserQueryVO;
import com.kandytan.base.model.BaseUserVO;
import org.apache.commons.lang3.StringUtils;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * 用户信息
 *
 * @author Kandy Tan
 * @since 1.0.0
 */
@Service
public class BaseUserServiceImpl implements BaseUserService {

    @Resource
    private BaseUserDao baseUserDao;

    @Override
    public List<BaseUserVO> selectList(BaseUserQueryVO baseUserQueryVO) {
        return baseUserDao.selectList(baseUserQueryVO);
    }

    @Override
    public BaseUserVO selectOne(BaseUserQueryVO baseUserQueryVO) {
        List<BaseUserVO> list = this.selectList(baseUserQueryVO);
        if(null == list || list.size()<1)
            return null;
        else
            return list.get(0);
    }

    @Override
    public boolean insert(List<BaseUserVO> list) {
        return baseUserDao.insert(list);
    }

    @Override
    public boolean insert(BaseUserVO baseUserVO) {
        if(null==baseUserVO || !baseUserVO.validate())
            return false;
        List<BaseUserVO> list = new ArrayList<BaseUserVO>();
        list.add(baseUserVO);
        return this.insert(list);
    }

    @Override
    public boolean update(List<BaseUserVO> list) {
        return baseUserDao.update(list);
    }

    @Override
    public boolean update(BaseUserVO baseUserVO) {
        if(null==baseUserVO || !baseUserVO.validate())
            return false;
        List<BaseUserVO> list = new ArrayList<BaseUserVO>();
        list.add(baseUserVO);
        return this.update(list);
    }

    @Override
    public boolean delete(List<BaseUserVO> list) {
        return baseUserDao.delete(list);
    }

    @Override
    public boolean delete(BaseUserVO baseUserVO) {
        if(null==baseUserVO || StringUtils.isBlank(baseUserVO.getUserId()))
            return false;
        List<BaseUserVO> list = new ArrayList<BaseUserVO>();
        list.add(baseUserVO);
        return this.delete(list);
    }
}
