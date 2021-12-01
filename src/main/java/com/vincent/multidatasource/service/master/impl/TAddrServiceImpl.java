package com.vincent.multidatasource.service.master.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.vincent.multidatasource.dao.master.TAddrMapper;
import com.vincent.multidatasource.entity.TAddr;
import com.vincent.multidatasource.service.ITAddrService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author vincent
 */
@Service
public class TAddrServiceImpl extends ServiceImpl<TAddrMapper, TAddr> implements ITAddrService {


    @Override
    public List<TAddr> getAll() {
        return lambdaQuery().list();
    }
}
