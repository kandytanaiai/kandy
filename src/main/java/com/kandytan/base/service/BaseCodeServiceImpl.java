package com.kandytan.base.service;

import com.kandytan.base.dao.BaseCodeDao;
import com.kandytan.base.dao.BaseUserDao;
import com.kandytan.base.model.BaseCodeVO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Kandy Tan
 * @since 1.0
 */
@Service
public class BaseCodeServiceImpl implements BaseCodeService {

    @Resource
    private BaseCodeDao baseCodeDao;

    @Override
    public List<BaseCodeVO> selectList(BaseCodeVO baseCodeQueryVO) {
        return baseCodeDao.selectList(baseCodeQueryVO);
    }
}
