package com.vincent.multidatasource.service.second.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.vincent.multidatasource.dao.second.TAddrMapper2;
import com.vincent.multidatasource.entity.TAddr;
import com.vincent.multidatasource.service.ITAddrService2;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author vincent
 */
@Service
public class TAddrServiceImpl2 extends ServiceImpl<TAddrMapper2, TAddr> implements ITAddrService2 {


    @Override

    public List<TAddr> getAll() {
        return lambdaQuery().list();
    }
}
