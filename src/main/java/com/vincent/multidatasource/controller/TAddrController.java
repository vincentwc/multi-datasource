package com.vincent.multidatasource.controller;


import com.vincent.multidatasource.entity.TAddr;
import com.vincent.multidatasource.service.ITAddrService;
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
    private ITAddrService service;

    @GetMapping("/all")
    public List<TAddr> getAll() {
        return service.getAll();
    }

    @GetMapping("/put")
    public void putData(){
        service.putDAta();
    }

    @GetMapping("put-m")
    public void putData2M(){
        service.putDAta2M();
    }

    @GetMapping("put-s")
    public void putData2S(){
        service.putDAta2S();
    }
}
