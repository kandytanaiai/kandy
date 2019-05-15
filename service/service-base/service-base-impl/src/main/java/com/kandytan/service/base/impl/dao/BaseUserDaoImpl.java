package com.kandytan.service.base.impl.dao;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.kandytan.base.util.DaoBase;
import com.kandytan.base.util.Pager;
import com.kandytan.service.base.api.model.BaseUserQueryVO;
import com.kandytan.service.base.api.model.BaseUserVO;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Kandy Tan
 * @since 1.0
 */
@Repository
public class BaseUserDaoImpl extends DaoBase implements BaseUserDao {
    @Override
    public List<BaseUserVO> selectList(BaseUserQueryVO baseUserQueryVO) throws Exception {
        return sqlSessionTemplate.selectList(BaseUserVO.class.getName() + ".selectList", baseUserQueryVO);
    }

    @Override
    public Pager<BaseUserVO> selectPager(BaseUserQueryVO baseUserQueryVO, int currPage, int pageSize) throws Exception {
        Page page = PageHelper.startPage(currPage, pageSize, true);
        List<BaseUserVO> baseUserVOList = sqlSessionTemplate.selectList(BaseUserVO.class.getName() + ".selectList", baseUserQueryVO);
//        List<BaseUserVO> baseUserVOList = new ArrayList<BaseUserVO>();
        Pager<BaseUserVO> pager = new Pager<BaseUserVO>(baseUserVOList, new Long(page.getTotal()).intValue(), currPage, pageSize);
        return pager;
    }

    @Override
    public boolean insert(List<BaseUserVO> list) throws Exception {
        int result = sqlSessionTemplate.insert(BaseUserVO.class.getName() + ".insert", list);
        return result > 0 ? true : false;
    }

    @Override
    public boolean update(List<BaseUserVO> list) throws Exception {
        int result = sqlSessionTemplate.update(BaseUserVO.class.getName() + ".update", list);
        return result > 0 ? true : false;
    }

    @Override
    public boolean delete(List<String> userIdList) throws Exception {
        int result = sqlSessionTemplate.delete(BaseUserVO.class.getName() + ".delete", userIdList);
        return result > 0 ? true : false;
    }
}
