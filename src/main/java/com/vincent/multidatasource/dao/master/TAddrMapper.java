package com.vincent.multidatasource.dao.master;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.vincent.multidatasource.entity.TAddr;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author vincent
 */
@Component
@DS("master")
public interface TAddrMapper extends BaseMapper<TAddr> {

    @Select("select * from t_addr where 1 = 1")
    List<TAddr> getAll();
}
