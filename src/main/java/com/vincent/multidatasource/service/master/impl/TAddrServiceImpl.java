package com.vincent.multidatasource.service.master.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.vincent.multidatasource.dao.master.TAddrMapper;
import com.vincent.multidatasource.entity.TAddr;
import com.vincent.multidatasource.service.ITAddrService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author vincent
 */
@Service
public class TAddrServiceImpl extends ServiceImpl<TAddrMapper, TAddr> implements ITAddrService {


    @Override
    public List<TAddr> getAll() {
        QueryWrapper<TAddr> wrapper = new QueryWrapper<>();
        wrapper.eq("id",1);
        return this.list(wrapper);
    }
}
