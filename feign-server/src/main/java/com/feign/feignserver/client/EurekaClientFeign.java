package com.feign.feignserver.client;

import com.feign.feignserver.client.config.FeignConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by fangzhipeng on 2017/6/21.
 */
@FeignClient(value = "hello",configuration = FeignConfig.class)
public interface EurekaClientFeign {

    @GetMapping(value = "/hi")
    String sayHiFromClientEureka(@RequestParam(value = "name") String name);
}
