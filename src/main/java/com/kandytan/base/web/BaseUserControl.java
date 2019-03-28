package com.kandytan.base.web;

import com.kandytan.base.model.BaseUserQueryVO;
import com.kandytan.base.model.BaseUserVO;
import com.kandytan.base.service.BaseUserService;
import com.kandytan.test.service.TestService;
import com.kandytan.util.Pager;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@RequestMapping("/base/user")
public class BaseUserControl {

    private static final Logger logger = LoggerFactory.getLogger( BaseUserControl.class);
    @Resource
    private BaseUserService baseUserService;

    @RequestMapping("/selectPager")
    public String selectPager(HttpServletRequest request, HttpServletResponse response) {
        int currPage = 1;
        int pageSize = 5;
        if(StringUtils.isNotBlank(request.getParameter("ipt_currPage")))
            currPage = Integer.parseInt(request.getParameter("ipt_currPage"));
        if(StringUtils.isNotBlank(request.getParameter("ipt_pageSize")))
            pageSize = Integer.parseInt(request.getParameter("ipt_pageSize"));
        BaseUserQueryVO baseUserQueryVO = new BaseUserQueryVO();
        if(StringUtils.isNotBlank(request.getParameter("ipt_userName")))
            baseUserQueryVO.setUserName(request.getParameter("ipt_userName"));
        Pager<BaseUserVO> pager = baseUserService.selectPager(baseUserQueryVO, currPage, pageSize);
        List<BaseUserVO> baseUserVOList = pager.getDataList();
        if(baseUserVOList!=baseUserVOList && baseUserVOList.size()>0) {
            for(BaseUserVO baseUserVO : baseUserVOList) {
                baseUserVO.setUserName("<a href=\"javascript:edit("+baseUserVO.getUserId()+");\">" + baseUserVO.getUserName() + "</a>");
            }
        }

        request.setAttribute("pager", pager);
        request.setAttribute("ipt_userName", request.getParameter("ipt_userName"));
        return "/view/base/user_list.jsp";
    }

    @RequestMapping("/save")
    @ResponseBody
    public String save(HttpServletRequest request, HttpServletResponse response, BaseUserVO baseUserVO) {
        String result = "false";
        if(StringUtils.isNotBlank(baseUserVO.getUserId()))
            result = String.valueOf(baseUserService.update(baseUserVO));
        else
            result = String.valueOf(baseUserService.insert(baseUserVO));
        return result;
    }

    @RequestMapping("/delete")
    @ResponseBody
    public String delete(HttpServletRequest request, HttpServletResponse response, List<String> userIdList) {
        String result = "false";
        result = String.valueOf(baseUserService.delete(userIdList));
        return result;
    }

}
