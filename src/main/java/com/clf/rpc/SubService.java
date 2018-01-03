package com.clf.rpc;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("sub-service")
public interface SubService {
	
	@RequestMapping(value = "/sub" ,method = RequestMethod.GET)
    public String sub(@RequestParam(value="a")Integer a, @RequestParam(value="b") Integer b);
}
