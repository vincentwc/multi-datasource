package com.vincent.multidatasource.controller;


import com.vincent.multidatasource.entity.TAddr;
import com.vincent.multidatasource.service.ITAddrServiceAll;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author vincent
 */
@RestController
@RequestMapping("/t-addr")
public class TAddrController {


    @Resource
    private ITAddrServiceAll service;

    @GetMapping("/all")
    public List<TAddr> getAll() {
        return service.getAll();
    }
}
