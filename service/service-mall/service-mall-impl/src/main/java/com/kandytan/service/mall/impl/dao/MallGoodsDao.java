package com.kandytan.service.mall.impl.dao;

import com.kandytan.base.util.Pager;
import com.kandytan.service.mall.api.model.MallGoodsQueryVO;
import com.kandytan.service.mall.api.model.MallGoodsVO;

import java.util.List;

/**
 * @author tanjianqin
 * @since 1.0
 */
public interface MallGoodsDao {

    List<MallGoodsVO> selectList(MallGoodsQueryVO mallGoodsQueryVO) throws Exception;

    Pager<MallGoodsVO> selectPager(MallGoodsQueryVO mallGoodsQueryVO, int currPage, int pageSize) throws Exception;

}
