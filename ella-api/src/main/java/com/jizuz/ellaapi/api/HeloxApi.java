package com.jizuz.ellaapi.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/ella")
@Api(value = "ella")
public interface HeloxApi {

    @ApiOperation("获取返回结果")
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    String getResponse();

}
