package com.kandytan.service.base.impl.web;

import com.kandytan.base.util.OperResult;
import com.kandytan.base.util.Pager;
import com.kandytan.service.base.api.model.BaseUserQueryVO;
import com.kandytan.service.base.api.model.BaseUserVO;
import com.kandytan.service.base.api.service.BaseUserService;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @author Kandy Tan
 * @since 1.0
 */
@RestController
public class BaseUserControl {

    private static final Logger logger = LoggerFactory.getLogger(BaseUserControl.class);
    @Resource
    private BaseUserService baseUserService;

    @RequestMapping("/selectPager")
    public @ResponseBody
    Pager<BaseUserVO> selectPager(HttpServletRequest request, HttpServletResponse response, @RequestBody BaseUserQueryVO baseUserQueryVO) {
        Pager<BaseUserVO> pager = baseUserService.selectPager(baseUserQueryVO);

        if (null != pager && null != pager.getDataList() && pager.getDataList().size() > 0) {
            for (BaseUserVO baseUserVO : pager.getDataList()) {
                baseUserVO.setUserName("<a href=\"javascript:edit('" + baseUserVO.getUserId() + "');\">" + baseUserVO.getUserName() + "</a>");
                String edit = "<a href=\"javascript:edit('" + baseUserVO.getUserId() + "');\">编辑</a>";
                String delete = "<a href=\"javascript:deleteId('" + baseUserVO.getUserId() + "');\">删除</a>";
                baseUserVO.setOper(edit + "&nbsp;" + delete);
            }
        }


        return pager;
    }

    @RequestMapping("/selectOne")
    @ResponseBody
    public BaseUserVO selectOne(HttpServletRequest request, HttpServletResponse response, @RequestBody BaseUserQueryVO baseUserQueryVO) {
        return baseUserService.selectOne(baseUserQueryVO);
    }

    @RequestMapping("/noExist")
    @ResponseBody
    public boolean noExist(HttpServletRequest request, HttpServletResponse response, BaseUserQueryVO baseUserQueryVO) {
        if (StringUtils.isNotBlank(baseUserQueryVO.getUserId()))
            return true;
        boolean result = baseUserService.noExist(baseUserQueryVO);
        return result;
    }

    @RequestMapping("/save")
    @ResponseBody
    public OperResult<BaseUserVO> save(HttpServletRequest request, HttpServletResponse response, @RequestBody BaseUserVO baseUserVO) {
        OperResult<BaseUserVO> operResult = null;

        if (StringUtils.isNotBlank(baseUserVO.getUserId()))
            operResult = baseUserService.update(baseUserVO);
        else
            operResult = baseUserService.insert(baseUserVO);

        return operResult;
    }

    @RequestMapping("/delete")
    @ResponseBody
    public OperResult<List<String>> delete(HttpServletRequest request, HttpServletResponse response, @RequestBody List<String> userIdList) {
        return baseUserService.delete(userIdList);
    }
}
