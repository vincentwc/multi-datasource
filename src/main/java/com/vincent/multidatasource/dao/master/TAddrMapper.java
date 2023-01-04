package com.vincent.multidatasource.dao.master;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.vincent.multidatasource.entity.TAddr;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * 主数据库不需要添加@DS
 *
 * @author vincent
 */
public interface TAddrMapper extends BaseMapper<TAddr> {


}
