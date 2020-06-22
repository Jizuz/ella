package com.jizuz.ellaclient.service;

import com.jizuz.ellaapi.api.HeloxApi;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "ellaApi", tags = {"ella服务"})
public class HeloxService implements HeloxApi {

    @Override
    public String getResponse() {
        return "Hello, ella!";
    }
}
