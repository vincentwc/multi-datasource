package com.vincent.multidatasource.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.vincent.multidatasource.entity.TAddr;

import java.util.List;


/**
 * @author vincent
 */
public interface ITAddrService extends IService<TAddr> {

    List<TAddr> getAll();
}
