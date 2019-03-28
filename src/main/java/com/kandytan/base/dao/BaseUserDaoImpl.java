package com.kandytan.base.dao;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.kandytan.base.model.BaseUserVO;
import com.kandytan.base.model.BaseUserQueryVO;
import com.kandytan.util.Pager;
import org.apache.ibatis.session.RowBounds;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * 用户信息
 *
 * @author Kandy Tan
 * @since 1.0.0
 */
@Repository
public class BaseUserDaoImpl implements BaseUserDao {

    @Resource
    private SqlSessionTemplate sqlSessionTemplate;

    @Override
    public List<BaseUserVO> selectList(BaseUserQueryVO baseUserQueryVO) {
        List<BaseUserVO> baseUserVOList = sqlSessionTemplate.selectList(BaseUserVO.class.getName() + ".selectList", baseUserQueryVO);
        return baseUserVOList;
    }

    @Override
    public Pager<BaseUserVO> selectPager(BaseUserQueryVO baseUserQueryVO, int currPage, int pageSize) {
        Page page = PageHelper.startPage(currPage, pageSize, true);
        List<BaseUserVO> baseUserVOList = sqlSessionTemplate.selectList(BaseUserVO.class.getName() + ".selectList", baseUserQueryVO);
        Pager<BaseUserVO> pager = new Pager<BaseUserVO>(baseUserVOList, new Long(page.getTotal()).intValue(), currPage, pageSize);

        return pager;
    }

    @Override
    public boolean insert(List<BaseUserVO> list) {
        int result = sqlSessionTemplate.insert(BaseUserVO.class.getName() + ".insert", list);
        return result > 0 ? true : false;
    }

    @Override
    public boolean update(List<BaseUserVO> list) {
        int result = sqlSessionTemplate.update(BaseUserVO.class.getName() + ".update", list);
        return result > 0 ? true : false;
    }

    @Override
    public boolean delete(List<String> userIdList) {
        int result = sqlSessionTemplate.delete(BaseUserVO.class.getName() + ".delete", userIdList);
        return result > 0 ? true : false;
    }
}
