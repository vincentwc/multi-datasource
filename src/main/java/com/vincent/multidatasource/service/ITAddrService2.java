package com.vincent.multidatasource.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.vincent.multidatasource.entity.TAddr2;

import java.util.List;


/**
 * @author vincent
 */
public interface ITAddrService2 extends IService<TAddr2> {

    List<TAddr2> getAll();
}
