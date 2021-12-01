package com.vincent.multidatasource.service.second.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.vincent.multidatasource.dao.second.TAddrMapper2;
import com.vincent.multidatasource.entity.TAddr2;
import com.vincent.multidatasource.service.ITAddrService2;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author vincent
 */
@Service
public class TAddrServiceImpl2 extends ServiceImpl<TAddrMapper2, TAddr2> implements ITAddrService2 {


    @Override
    public List<TAddr2> getAll() {
        QueryWrapper<TAddr2> wrapper = new QueryWrapper<>();
        wrapper.eq("id", 1);
        return this.list(wrapper);
    }
}
