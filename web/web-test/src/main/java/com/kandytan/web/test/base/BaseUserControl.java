package com.kandytan.web.test.base;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Kandy Tan
 * @since 1.0
 */
@Controller
@RequestMapping("/base/user")
public class BaseUserControl {

    @RequestMapping("/toUserList")
    public String toUserList(HttpServletRequest request, HttpServletResponse response) {
//        return "/test.jsp";
        return "/test.html";
    }

    @RequestMapping("/toUserEdit")
    public String toUserEdit(HttpServletRequest request, HttpServletResponse response) {
        String userId = request.getParameter("userId");
        if (StringUtils.isNotBlank(userId))
            request.setAttribute("userId", userId);
        return "/view/base/user_edit.jsp";
    }

}
