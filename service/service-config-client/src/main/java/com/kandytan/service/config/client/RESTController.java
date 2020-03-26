package com.kandytan.service.config.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class RESTController {

    @Autowired
    private GitConfig gitConfig;

    @GetMapping(value = "show")
    public Object show(){
        return gitConfig;
    }

}
