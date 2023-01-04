package com.vincent.multidatasource.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.vincent.multidatasource.dao.master.TAddrMapper;
import com.vincent.multidatasource.dao.second.TAddrMapper2;
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

    @Resource
    private TAddrMapper mapper;

    @Resource
    private TAddrMapper2 mapper2;

    @Override
    public List<TAddr> getAll() {
        List<TAddr> master = getMaster();
        List<TAddr> slave = getSlave();
        master.addAll(slave);
        return master;
    }

    @Override
    public void putDAta() {
        // master
        putData2Master();
        // salve
        putData2Salve();
    }

    @Override
    public void putDAta2M() {
        TAddr tAddr = new TAddr();
        tAddr.setAddr("2M");
        save(tAddr);
    }

    @DS("pcd_43")
    @Override
    public void putDAta2S() {
        TAddr tAddr = new TAddr();
        tAddr.setAddr("2S");
        mapper2.insert(tAddr);
    }


    private void putData2Master(){
        TAddr tAddr = new TAddr();
        tAddr.setAddr("master_2");
        mapper.insert(tAddr);
    }

    @DS("pcd_43")
    private void putData2Salve(){
        TAddr tAddr = new TAddr();
        tAddr.setAddr("salve_2");
        mapper.insert(tAddr);
    }

    @DS("pcd_37")
    private List<TAddr> getMaster() {
        return mapper.selectList(new QueryWrapper<>());
    }


    @DS("pcd_43")
    private List<TAddr> getSlave() {
        return mapper2.selectList(new QueryWrapper<>());
    }
}
