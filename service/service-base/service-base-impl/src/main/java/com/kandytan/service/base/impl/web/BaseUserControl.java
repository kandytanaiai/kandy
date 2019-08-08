package com.kandytan.service.base.impl.web;

import com.kandytan.base.util.OperResult;
import com.kandytan.base.util.Pager;
import com.kandytan.service.base.api.model.BaseUserQueryVO;
import com.kandytan.service.base.api.model.BaseUserVO;
import com.kandytan.service.base.api.service.BaseUserService;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @author Kandy Tan
 * @since 1.0
 */
@Controller
@RequestMapping(value = "/user/")
public class BaseUserControl {

    private static final Logger logger = LoggerFactory.getLogger(BaseUserControl.class);
    @Resource
    private BaseUserService baseUserService;

    @RequestMapping("selectPager")
    public @ResponseBody
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
        baseUserQueryVO.setUserId(userId);
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

        if (StringUtils.isNotBlank(baseUserVO.getUserId()))
            operResult = baseUserService.update(baseUserVO);
        else
            operResult = baseUserService.insert(baseUserVO);

        return operResult;
    }

    @RequestMapping("delete")
    @ResponseBody
    public OperResult<List<String>> delete(HttpServletRequest request, HttpServletResponse response, @RequestBody List<String> userIdList) {
        return baseUserService.delete(userIdList);
    }
}
