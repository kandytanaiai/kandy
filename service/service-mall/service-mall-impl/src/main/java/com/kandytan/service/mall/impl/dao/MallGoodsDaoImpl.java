package com.kandytan.service.mall.impl.dao;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.kandytan.base.util.DaoBase;
import com.kandytan.base.util.Pager;
import com.kandytan.service.mall.api.model.MallGoodsQueryVO;
import com.kandytan.service.mall.api.model.MallGoodsVO;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author tanjianqin
 * @since 1.0
 */
@Repository
public class MallGoodsDaoImpl extends DaoBase implements MallGoodsDao {
    @Override
    public List<MallGoodsVO> selectList(MallGoodsQueryVO mallGoodsQueryVO) throws Exception {
        return sqlSessionTemplate.selectList(MallGoodsVO.class.getName() + ".selectList", mallGoodsQueryVO);
    }

    @Override
    public Pager<MallGoodsVO> selectPager(MallGoodsQueryVO mallGoodsQueryVO, int currPage, int pageSize) throws Exception {
        Page page = PageHelper.startPage(currPage, pageSize, true);
        List<MallGoodsVO> mallGoodsVOList = sqlSessionTemplate.selectList(MallGoodsVO.class.getName() + ".selectList", mallGoodsQueryVO);
        Pager<MallGoodsVO> pager = new Pager<MallGoodsVO>(mallGoodsVOList, new Long(page.getTotal()).intValue(), currPage, pageSize);
        return pager;
    }
}
