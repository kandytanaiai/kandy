package com.kandytan.service.mall.impl.service;

import com.kandytan.base.util.Pager;
import com.kandytan.service.mall.api.model.MallGoodsQueryVO;
import com.kandytan.service.mall.api.model.MallGoodsVO;
import com.kandytan.service.mall.api.service.MallGoodsService;
import com.kandytan.service.mall.impl.dao.MallGoodsDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author tanjianqin
 * @since 1.0
 */
@Service
public class MallGoodsServiceImpl implements MallGoodsService {

    private static final Logger logger = LoggerFactory.getLogger(MallGoodsServiceImpl.class);

    @Resource
    private MallGoodsDao mallGoodsDao;

    @Override
    public List<MallGoodsVO> selectList(MallGoodsQueryVO mallGoodsQueryVO) {
        List<MallGoodsVO> mallGoodsVOList = null;
        try {
            mallGoodsVOList = mallGoodsDao.selectList(mallGoodsQueryVO);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
        return mallGoodsVOList;
    }

    @Override
    public Pager<MallGoodsVO> selectPager(MallGoodsQueryVO mallGoodsQueryVO) {
        Pager<MallGoodsVO> pager = null;
        try {
            pager = mallGoodsDao.selectPager(mallGoodsQueryVO, mallGoodsQueryVO.getPager().getCurrPage(), mallGoodsQueryVO.getPager().getPageSize());
            List<MallGoodsVO> mallGoodsVOList =  pager.getDataList();
            if(mallGoodsVOList!=null && mallGoodsVOList.size()>0) {
                for(int i=0; i<mallGoodsVOList.size(); i++) {
                    MallGoodsVO mallGoodsVO = mallGoodsVOList.get(i);

                }
            }
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
        return pager;
    }
}
