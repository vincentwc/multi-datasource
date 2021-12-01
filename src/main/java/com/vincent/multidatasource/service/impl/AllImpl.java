package com.vincent.multidatasource.service.impl;

import com.vincent.multidatasource.entity.TAddr;
import com.vincent.multidatasource.service.ITAddrService;
import com.vincent.multidatasource.service.ITAddrService2;
import com.vincent.multidatasource.service.ITAddrServiceAll;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AllImpl implements ITAddrServiceAll {

    @Resource
    private ITAddrService service;

    @Resource
    private ITAddrService2 service2;

    @Override
    public List<TAddr> getAll() {
        List<TAddr> list = service.getAll();
        List<TAddr> list1 = service2.getAll();
        list.stream().forEach(System.out::println);
        System.out.println("=======");
        list1.stream().forEach(System.out::println);

        list.addAll(list1);
        return list;
    }

    @Override
    public List<TAddr> getAll2() {
        List<TAddr> list = service.list();
        List<TAddr> list1 = service2.list();
        list.addAll(list1);
        return list;
    }
}
