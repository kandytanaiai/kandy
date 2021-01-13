package com.kandytan.service.component.impl.id.web;

import com.kandytan.service.component.api.service.IdService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Kandy Tan
 * @since 1.0
 */
@RestController
@RequestMapping(value = "/component/id/")
public class IdControl {

    @Resource
    private IdService idService;

    @RequestMapping("getId")
    public @ResponseBody
    Long getId(HttpServletRequest request, HttpServletResponse response) {
        return idService.getId();
    }

}
