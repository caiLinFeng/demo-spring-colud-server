package com.clf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.clf.rpc.SubService;

@RestController
public class AddController {
	
	@Value("${server.port}")
	private String port;
	
	@Autowired
	private SubService subService;
	
	@RequestMapping(value = "/add" ,method = RequestMethod.GET)
    public String add(@RequestParam Integer a, @RequestParam Integer b) {
        Integer r = a + b;
        return "result="+r+";port:"+port;
    }
}
