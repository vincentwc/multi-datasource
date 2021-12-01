package com.vincent.multidatasource.dao.second;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.vincent.multidatasource.entity.TAddr;

/**
 * @author vincent
 */
@DS("slave")
public interface TAddrMapper2 extends BaseMapper<TAddr> {

}
