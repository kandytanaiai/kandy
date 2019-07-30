package com.kandytan.service.base.impl.service;

import com.kandytan.service.base.api.model.BaseCodeVO;
import com.kandytan.service.base.api.service.BaseCodeService;
import com.kandytan.service.base.impl.dao.BaseCodeDao;
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
