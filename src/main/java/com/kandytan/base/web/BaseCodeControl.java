package com.kandytan.base.web;

import com.kandytan.base.model.BaseCodeVO;
import com.kandytan.base.service.BaseCodeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Kandy Tan
 * @since 1.0
 */

@Controller
@RequestMapping("/base/code")
public class BaseCodeControl {

    @Resource
    private BaseCodeService baseCodeService;

    @RequestMapping("/selectList")
    public @ResponseBody
    List<BaseCodeVO> selectList(@RequestBody BaseCodeVO baseCodeQueryVO) {
        List<BaseCodeVO> baseCodeVOList = baseCodeService.selectList(baseCodeQueryVO);

        return baseCodeVOList;
    }

}
