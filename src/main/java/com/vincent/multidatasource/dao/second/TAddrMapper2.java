package com.vincent.multidatasource.dao.second;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.vincent.multidatasource.entity.TAddr;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author vincent
 */
@Component
public interface TAddrMapper2 extends BaseMapper<TAddr> {

    @Select("select * from t_addr")
    List<TAddr> getAll();
}
