package com.kandytan.base.service;

import com.kandytan.base.dao.BaseUserDao;
import com.kandytan.base.model.BaseUserQueryVO;
import com.kandytan.base.model.BaseUserVO;
import com.kandytan.util.OperResult;
import com.kandytan.util.Pager;
import com.kandytan.util.UUID;
import com.kandytan.util.pro.RedisPro;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    private static final Logger logger = LoggerFactory.getLogger( BaseUserServiceImpl.class);

    @Resource
    private BaseUserDao baseUserDao;

    @Override
    public List<BaseUserVO> selectList(BaseUserQueryVO baseUserQueryVO) {
        List<BaseUserVO> baseUserVOList = null;
        try {
            baseUserVOList = baseUserDao.selectList(baseUserQueryVO);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
        return baseUserVOList;
    }

    @Override
    public Pager<BaseUserVO> selectPager(BaseUserQueryVO baseUserQueryVO) {
        String a = RedisPro.getMaxIdle();
        System.out.println();
        Pager<BaseUserVO> pager = null;
        try {
            pager = baseUserDao.selectPager(baseUserQueryVO, baseUserQueryVO.getPager().getCurrPage(), baseUserQueryVO.getPager().getPageSize());
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
        return pager;
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
    public boolean noExist(BaseUserQueryVO baseUserQueryVO) {
        BaseUserQueryVO baseUserQueryVOQ = new BaseUserQueryVO();
        if(StringUtils.isNotBlank(baseUserQueryVO.getTel())) {
            baseUserQueryVOQ.setTel(baseUserQueryVO.getTel());
        } else if(StringUtils.isNotBlank(baseUserQueryVO.getEmail())) {
            baseUserQueryVOQ.setEmail(baseUserQueryVO.getEmail());
        } else {
            return true;
        }
        BaseUserVO baseUserVO = this.selectOne(baseUserQueryVOQ);
        return null == baseUserVO;
    }

    @Override
    public OperResult<BaseUserVO> insert(BaseUserVO baseUserVO) {
        OperResult<BaseUserVO> operResult = new OperResult<BaseUserVO>(baseUserVO);

        if(StringUtils.isBlank(baseUserVO.getUserId()))
            baseUserVO.setUserId(UUID.getUUID());
        List<BaseUserVO> list = new ArrayList<BaseUserVO>();
        list.add(baseUserVO);
        try {
            baseUserDao.insert(list);
            operResult.setSuccess("新增成功");
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            operResult.setUnknownError();
        }
        return operResult;
    }

    @Override
    public OperResult<BaseUserVO> update(BaseUserVO baseUserVO) {
        OperResult<BaseUserVO> operResult = new OperResult<BaseUserVO>(baseUserVO);

        List<BaseUserVO> list = new ArrayList<BaseUserVO>();
        list.add(baseUserVO);
        try {
            baseUserDao.update(list);
            operResult.setSuccess("更新成功");
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            operResult.setUnknownError();
        }
        return operResult;
    }

    @Override
    public OperResult<List<String>> delete(List<String> userIdList) {
        OperResult<List<String>> operResult = new OperResult<List<String>>(userIdList);
        try {
            baseUserDao.delete(userIdList);
            operResult.setSuccess("删除成功");
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            operResult.setUnknownError();
        }

        return operResult;
    }

}
