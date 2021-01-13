package com.kandytan.service.base.impl.web;

import com.kandytan.base.util.OperResult;
import com.kandytan.base.util.Pager;
import com.kandytan.service.base.api.model.BaseUserQueryVO;
import com.kandytan.service.base.api.model.BaseUserVO;
import com.kandytan.service.base.api.service.BaseUserService;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @author Kandy Tan
 * @since 1.0
 */
@RestController
@RequestMapping(value = "/user/")
@RefreshScope
public class BaseUserControl {

    private static final Logger logger = LoggerFactory.getLogger(BaseUserControl.class);
    @Resource
    private BaseUserService baseUserService;

    @RequestMapping("selectPager")
    public
    Pager<BaseUserVO> selectPager(HttpServletRequest request, HttpServletResponse response, @RequestBody BaseUserQueryVO baseUserQueryVO) {
        Pager<BaseUserVO> pager = baseUserService.selectPager(baseUserQueryVO);
        return pager;
    }

    @RequestMapping("selectOne")
    @ResponseBody
    public BaseUserVO selectOne(HttpServletRequest request, HttpServletResponse response, @RequestBody BaseUserQueryVO baseUserQueryVO) {
        return baseUserService.selectOne(baseUserQueryVO);
    }

    @RequestMapping(value = "noExist", method = RequestMethod.POST)
    @ResponseBody
    public boolean noExist(HttpServletRequest request, HttpServletResponse response) {
        String userId = request.getParameter("userId");
        String tel = request.getParameter("tel");
        String email = request.getParameter("email");
        if(StringUtils.isBlank(tel) && StringUtils.isBlank(email)) {
            return false;
        }
        BaseUserQueryVO baseUserQueryVO = new BaseUserQueryVO();
        baseUserQueryVO.setUserId(Long.valueOf(userId));
        if(StringUtils.isNotBlank(tel)) {
            baseUserQueryVO.setTel(tel);
        }
        if(StringUtils.isNotBlank(email)) {
            baseUserQueryVO.setEmail(email);
        }

        boolean result = baseUserService.noExist(baseUserQueryVO);
        return result;
    }

    @RequestMapping("save")
    @ResponseBody
    public OperResult<BaseUserVO> save(HttpServletRequest request, HttpServletResponse response, @RequestBody BaseUserVO baseUserVO) {
        OperResult<BaseUserVO> operResult = null;

        if (baseUserVO.getUserId() != null)
            operResult = baseUserService.update(baseUserVO);
        else
            operResult = baseUserService.insert(baseUserVO);

        return operResult;
    }

    @RequestMapping("delete")
    @ResponseBody
    public OperResult<List<Long>> delete(HttpServletRequest request, HttpServletResponse response, @RequestBody List<Long> userIdList) {
        return baseUserService.delete(userIdList);
    }
}
