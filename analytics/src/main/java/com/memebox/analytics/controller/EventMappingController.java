package com.memebox.analytics.controller;

import com.memebox.analytics.service.EventMappingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * Created by Frank on 17/5/17.
 */
@Controller
@RequestMapping("/mapping")
public class EventMappingController {
    @Autowired
    EventMappingService eventMappingService;

    @RequestMapping(value = "/list" , method = RequestMethod.GET)
    @ResponseBody
    public Object getMappingList(){
       return eventMappingService.getMappingList();
    }
    
}

