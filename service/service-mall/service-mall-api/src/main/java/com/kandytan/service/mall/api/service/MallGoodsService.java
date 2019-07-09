package com.kandytan.service.mall.api.service;

import com.kandytan.base.util.Pager;
import com.kandytan.service.mall.api.model.MallGoodsQueryVO;
import com.kandytan.service.mall.api.model.MallGoodsVO;

import java.util.List;

/**
 * @author tanjianqin
 * @since 1.0
 */
public interface MallGoodsService {

    List<MallGoodsVO> selectList(MallGoodsQueryVO mallGoodsQueryVO);

    Pager<MallGoodsVO> selectPager(MallGoodsQueryVO mallGoodsQueryVO);

}
